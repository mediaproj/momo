package com.mediaproj.momo.data;

public class Preference {

    private Section section;
    private Genre genre;

    public Preference(Section section, Genre genre) {
        this.section = section;
        this.genre = genre;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
