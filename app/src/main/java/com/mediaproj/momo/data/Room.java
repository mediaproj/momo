package com.mediaproj.momo.data;

public class Room {
    String id;
    String title;
    boolean enable;

    public Room(String id, String title, boolean enable) {
        this.id = id;
        this.title = title;
        this.enable = enable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
