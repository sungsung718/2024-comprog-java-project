package com.example.rankit.data.source;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.rankit.utils.Rank;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class RankLocalDataSource implements DataSource{
    private final SharedPreferences sharedPreferences;
    private final SharedPreferences.Editor editor;
    private final String KEY = "Rank";
    private int lastId;

    public RankLocalDataSource(Context context) {
        this.sharedPreferences = context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
        this.editor = sharedPreferences.edit();
        this.lastId = sharedPreferences.getInt("last_id", 0);
    }

    public int getLastId() {
        return lastId;
    }

    public Rank getItem(int id) {
        String json = sharedPreferences.getString(String.valueOf(id), "");

        if (json.isEmpty())
            return null;

        Gson gson = new Gson();
        return gson.fromJson(json, Rank.class);
    }

    public List<Rank> getAllItems() {
        List<Rank> items = new ArrayList<>();
        for (String key : sharedPreferences.getAll().keySet()) {
            if (key.equals("last_id"))
                continue;
            Rank rank = getItem(Integer.parseInt(key));
            items.add(rank);
        }
        return items;
    }

    public void createItem(Rank item) {
        // https://www.geeksforgeeks.org/how-to-save-arraylist-to-sharedpreferences-in-android/
        editor.putString(String.valueOf(item.getId()), item.toJson());

        this.lastId = item.getId();
        editor.putInt("last_id", lastId);

        editor.apply();
    }

    public void deleteItem(int id) {
        editor.remove(String.valueOf(id));
    }
}
