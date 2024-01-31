package com.example.noteapp;

public class FootballClubData {
    private final int imgResId;
    private final String clubName;
    private final int clubDescription;

    public FootballClubData(int imgResId, String clubName, int clubDescription) {
        this.imgResId = imgResId;
        this.clubName = clubName;
        this.clubDescription = clubDescription;
    }

    public int getImgResId() {
        return imgResId;
    }

    public String getClubName() {
        return clubName;
    }

    public int getClubDescription() {
        return clubDescription;
    }
}
