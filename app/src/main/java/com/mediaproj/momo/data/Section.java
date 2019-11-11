package com.mediaproj.momo.data;

public class Section {
    private boolean movie;
    private boolean musical;
    private boolean show;
    private boolean festival;

    public Section(boolean movie, boolean musical, boolean show, boolean festival) {
        this.movie = movie;
        this.musical = musical;
        this.show = show;
        this.festival = festival;
    }

    public boolean isMovie() {
        return movie;
    }

    public boolean isMusical() {
        return musical;
    }

    public boolean isShow() {
        return show;
    }

    public boolean isFestival() {
        return festival;
    }
}
