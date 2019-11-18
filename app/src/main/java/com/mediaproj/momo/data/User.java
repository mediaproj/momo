package com.mediaproj.momo.data;

public class User {
    private String email;
    private String profileImg;
    private String password;
    private int age;
    private boolean gender; // T-남
    private String name;
    private Preference preference;

    public User() {

    }

    public User(String email, String profileImg, String password, int age, boolean gender, String name, Preference preference) {
        this.email = email;
        this.profileImg = profileImg;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.preference = preference;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
    }
}