package com.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber + ".");
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in the album.");
        return false;
    }
}
