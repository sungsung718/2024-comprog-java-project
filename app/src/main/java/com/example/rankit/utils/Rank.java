package com.example.rankit.utils;

import com.google.gson.Gson;
import java.util.List;

public class Rank {
    private int id;
    private String name;
    private List<RankCandidate> candidates;
    private int totalScore;

    public Rank(String name, List<RankCandidate> candidates, int totalScore) {
        this.name = name;
        this.candidates = candidates;
        this.totalScore = totalScore;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<RankCandidate> getCandidates() {
        return candidates;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
