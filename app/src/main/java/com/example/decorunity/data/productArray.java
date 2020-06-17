package com.example.decorunity.data;

import com.example.decorunity.R;
import com.example.decorunity.pojo.ProductModel;

import java.util.ArrayList;

public class productArray {
    public ArrayList getArray1(){
        ArrayList <ProductModel> productModels =new ArrayList<ProductModel>();

            ProductModel productModel = new ProductModel(1,"Roknah", "IKEA", "20000LE", R.drawable.kanaba1);
            productModels.add(productModel);
                    ProductModel productMode2 = new ProductModel(2,"Big Chair", "Coaster", "20000LE", R.drawable.kanaba2);
            productModels.add(productMode2);
                    ProductModel productMode3 = new ProductModel(3,"Chair", "IKEA", "20000LE", R.drawable.kanaba3);
            productModels.add(productMode3);
                    ProductModel productMode4 = new ProductModel(4,"Kanaba", "IKEA", "20000LE", R.drawable.kanaba4);
            productModels.add(productMode4);
                    ProductModel productMode5 = new ProductModel(5,"Kanaba", "IKEA", "20000LE", R.drawable.kanaba5);
            productModels.add(productMode5);
                    ProductModel productMode6 = new ProductModel(6,"Antreh", "Coaster", "20000LE", R.drawable.kanaba6);
            productModels.add(productMode6);
                    ProductModel productMode7 = new ProductModel(7,"Kanaba", "IKEA", "20000LE", R.drawable.kanaba7);
            productModels.add(productMode7);
                    ProductModel productMode8 = new ProductModel(8,"Antreh", "Coaster", "20000LE", R.drawable.bed2);
            productModels.add(productMode8);
                    ProductModel productMode9 = new ProductModel(9,"Antreh", "Stickley", "20000LE", R.drawable.bed3);
            productModels.add(productMode9);
                    ProductModel productModel0 = new ProductModel(10,"Sofra", "Stickley", "20000LE", R.drawable.sofra);
            productModels.add(productModel0);
                    ProductModel productModel1 = new ProductModel(11,"Big BedRoom", "Stickley", "20000LE", R.drawable.bed1);
            productModels.add(productModel1);
                    ProductModel productModel2 = new ProductModel(12,"BedRoom", "IKEA", "20000LE", R.drawable.bed4);
            productModels.add(productModel2);
                    ProductModel productModel3 = new ProductModel(13,"Sofra", "Stickley", "20000LE", R.drawable.bed5);
            productModels.add(productModel3);


        return productModels ;
    }
}
