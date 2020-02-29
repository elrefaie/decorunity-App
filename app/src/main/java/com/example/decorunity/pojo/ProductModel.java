package com.example.decorunity.pojo;

public class ProductModel {
    private int id;
    private String productName;
  private   String brand;
   private String productPrice;
   private int productImg;


    public ProductModel(){}

    public ProductModel(int id,String productName, String brand, String productPrice, int productImg) {
        this.id = id;
        this.brand = brand;
        this.productPrice = productPrice;
        this.productImg = productImg;
        this.productName=productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductImg() {
        return productImg;
    }

    public void setProductImg(int productImg) {
        this.productImg = productImg;
    }
}
