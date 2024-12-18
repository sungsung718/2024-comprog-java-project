package com.example.rankit.data.repository;

import com.example.rankit.data.source.RankLocalDataSource;
import com.example.rankit.utils.Rank;
import java.util.List;

public class RankRepository implements Repository {
    private final RankLocalDataSource rankLocalDataSource;

    public RankRepository(RankLocalDataSource rankLocalDataSource) {
        this.rankLocalDataSource = rankLocalDataSource;
    }

    public Rank getItem(int id) {
        return rankLocalDataSource.getItem(id);
    }

    public List<Rank> getAllItems() {
        return rankLocalDataSource.getAllItems();
    }

    public void createItem(Rank item) {
        item.setId(rankLocalDataSource.getLastId() + 1);
        rankLocalDataSource.createItem(item);
    }

    public void deleteItem(int id) {
        rankLocalDataSource.deleteItem(id);
    }

}
