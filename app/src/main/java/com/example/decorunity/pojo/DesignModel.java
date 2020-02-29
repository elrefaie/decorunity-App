package com.example.decorunity.pojo;

public class DesignModel {
    private int id;
    private String designerName;
    private String desciption;
    private int designImg;
    private String designPrice;

    public DesignModel(){

    }

    public DesignModel(int id, String designerName, String desciption, int designImg, String designPrice) {
        this.id=id;
        this.designerName = designerName;
        this.desciption = desciption;
        this.designImg = designImg;
        this.designPrice = designPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignerName() {
        return designerName;
    }

    public void setDesignerName(String designerName) {
        this.designerName = designerName;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public int getDesignImg() {
        return designImg;
    }

    public void setDesignImg(int designImg) {
        this.designImg = designImg;
    }

    public String getDesignPrice() {
        return designPrice;
    }

    public void setDesignPrice(String designPrice) {
        this.designPrice = designPrice;
    }
}
