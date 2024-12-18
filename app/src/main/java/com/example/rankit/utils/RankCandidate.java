package com.example.rankit.utils;

public class RankCandidate {

    private String name;
    private int score;
    private String description;

    public RankCandidate(String name, int score, String description) {
        this.name = name;
        this.score = score;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
