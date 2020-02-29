package com.example.decorunity.data;

import com.example.decorunity.R;
import com.example.decorunity.pojo.PeopleModel;

import java.util.ArrayList;

public class peopleArray {
    public ArrayList getArray1(){
        ArrayList <PeopleModel> peobleModels =new ArrayList<PeopleModel>();

        for (int i=0;i<30;i++) {
            PeopleModel peobleModel = new PeopleModel(1, "Rahma", "Fcic Designer Man", R.drawable.account_circle);
            peobleModels.add(peobleModel);
        }

        return peobleModels ;
    }




}
