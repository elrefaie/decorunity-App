package com.example.decorunity.data;

import com.example.decorunity.R;
import com.example.decorunity.pojo.ProductModel;

import java.util.ArrayList;

public class ProductUsed {
    public ArrayList getArray1() {
        ArrayList<ProductModel> productModels = new ArrayList<ProductModel>();

        ProductModel productModel = new ProductModel(1, "Roknah", "IKEA", "20000LE", R.drawable.kanaba1);
        productModels.add(productModel);
        ProductModel productMode2 = new ProductModel(2, "Big Chair", "Coaster", "20000LE", R.drawable.kanaba2);
        productModels.add(productMode2);
        ProductModel productMode3 = new ProductModel(3, "Chair", "IKEA", "20000LE", R.drawable.kanaba3);
        productModels.add(productMode3);
        ProductModel productMode4 = new ProductModel(4, "Kanaba", "IKEA", "20000LE", R.drawable.kanaba4);
        productModels.add(productMode4);
        return productModels;
    }
}
