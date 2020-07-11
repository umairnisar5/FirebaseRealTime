package com.example.firebaserealtime;

public class Artist {

    String artistId;
    String artistName;
    String artistGenre;

    public Artist(){

    }

    public Artist(String artistId, String artistName, String artistGenres) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenres;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenres() {
        return artistGenre;
    }
}
