package com.rozogar.hazaragi.ui.theme;

import androidx.annotation.NonNull;

public class Music {
    private int img;
    private int song;
    private String name;
    private int seek;
    private int btnplaystop;
    private int btnprevious;
    private int btnnext;
    private int starttime;
    private int finishedtime;
    private int allone;

    public Music() {
    }

    public Music(int img, int song, String name, int seek, int btnplaystop, int btnprevious, int btnnext, int starttime, int finishedtime, int allone) {
        this.img = img;
        this.song = song;
        this.name = name;
        this.seek = seek;
        this.btnplaystop = btnplaystop;
        this.btnprevious = btnprevious;
        this.btnnext = btnnext;
        this.starttime = starttime;
        this.finishedtime = finishedtime;
        this.allone = allone;
    }

    public Music(int img, int song, String name) {
        this.img = img;
        this.song = song;
        this.name = name;
    }

    public Music(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeek() {
        return seek;
    }

    public void setSeek(int seek) {
        this.seek = seek;
    }

    public int getBtnplaystop() {
        return btnplaystop;
    }

    public void setBtnplaystop(int btnplaystop) {
        this.btnplaystop = btnplaystop;
    }

    public int getBtnprevious() {
        return btnprevious;
    }

    public void setBtnprevious(int btnprevious) {
        this.btnprevious = btnprevious;
    }

    public int getBtnnext() {
        return btnnext;
    }

    public void setBtnnext(int btnnext) {
        this.btnnext = btnnext;
    }

    public int getStarttime() {
        return starttime;
    }

    public void setStarttime(int starttime) {
        this.starttime = starttime;
    }

    public int getFinishedtime() {
        return finishedtime;
    }

    public void setFinishedtime(int finishedtime) {
        this.finishedtime = finishedtime;
    }

    public int getAllone() {
        return allone;
    }

    public void setAllone(int allone) {
        this.allone = allone;
    }
}
