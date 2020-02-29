package com.example.decorunity.pojo;

public class ChipModel {
    private String category;
    private int id;

    public ChipModel(){}
    public ChipModel(String category,int id){

        this.category=category;
        this.id=id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
