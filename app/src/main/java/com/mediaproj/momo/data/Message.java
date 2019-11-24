package com.mediaproj.momo.data;

public class Message {
    String roomId;
    String name;
    String text;
    Long time;

    public Message() {
    }

    public Message(String roomId, String name, String text, Long time) {
        this.roomId = roomId;
        this.name = name;
        this.text = text;
        this.time = time;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
