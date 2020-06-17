package com.example.decorunity.data;

import com.example.decorunity.R;
import com.example.decorunity.pojo.PeopleModel;

import java.util.ArrayList;

public class peopleArray {
    public ArrayList getArray1(){
        ArrayList <PeopleModel> peobleModels =new ArrayList<PeopleModel>();

            PeopleModel peobleModel = new PeopleModel(1, "Ali Ghanim", "Fcic Designer Man \nFaculty of Fine Arts", R.drawable.account_circle);
            peobleModels.add(peobleModel);
            PeopleModel peobleMode2 = new PeopleModel(2, "Saif Magdy", "Fcic Designer Man", R.drawable.account_circle);
            peobleModels.add(peobleMode2);
            PeopleModel peobleMode3 = new PeopleModel(3, "Noooor", "Faculty of Fine Arts", R.drawable.account_circle);
            peobleModels.add(peobleMode3);
            PeopleModel peobleMode4 = new PeopleModel(4, "Rahma Eldeen", "Fcic Designer Man", R.drawable.account_circle);
            peobleModels.add(peobleMode4);
            PeopleModel peobleMode5 = new PeopleModel(5, "Morad Eldeen", "Fcic Designer Man", R.drawable.account_circle);
            peobleModels.add(peobleMode5);
            PeopleModel peobleMode6 = new PeopleModel(6, "Rahma Mohamed", "Fcic Designer Man", R.drawable.account_circle);
            peobleModels.add(peobleMode6);
            PeopleModel peobleMode7 = new PeopleModel(7, "Ahmed Mohamed", "Faculty of Fine Arts", R.drawable.account_circle);
            peobleModels.add(peobleMode7);
            PeopleModel peobleMode8 = new PeopleModel(8, "Tarneem", "Fcic Designer Man", R.drawable.account_circle);
            peobleModels.add(peobleMode8);
            PeopleModel peobleMode9 = new PeopleModel(9, "lobna Khan", "Fcic Designer Man", R.drawable.account_circle);
            peobleModels.add(peobleMode9);
        return peobleModels ;
    }




}
