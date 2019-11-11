package com.mediaproj.momo.data;

public class User {
    private String email;
    private String profileImg;
    private String password;
    private int age;
    private boolean gender; // T-남
    private String name;
    private Section section;
    private Genre genre;

    public User(String email, String profileImg, String password, int age, boolean gender, String name, Section section, Genre genre) {
        this.email = email;
        this.profileImg = profileImg;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.section = section;
        this.genre = genre;
    }

    public String getEmail() {
        return email;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public String getPassword() {
        return password;
    }


    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Section getSection() {
        return section;
    }

    public Genre getGenre() {
        return genre;
    }
}