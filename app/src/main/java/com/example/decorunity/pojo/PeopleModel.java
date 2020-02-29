package com.example.decorunity.pojo;

public class PeopleModel {
    private int id;
    private String name;
    private String bio;
    private int img;

    public PeopleModel(){}

    public PeopleModel(int id, String name, String bio, int img) {
        this.id = id;
        this.name = name;
        this.bio = bio;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
