package com.example.decorunity.data;

import com.example.decorunity.R;
import com.example.decorunity.pojo.ProductModel;

import java.util.ArrayList;

public class productArray {
    public ArrayList getArray1(){
        ArrayList <ProductModel> productModels =new ArrayList<ProductModel>();

        for (int i=0;i<30;i++) {
            ProductModel productModel = new ProductModel(1,"MostainBellah", "IKEA", "20000LE", R.drawable.design1);
            productModels.add(productModel);
        }

        return productModels ;
    }
}
