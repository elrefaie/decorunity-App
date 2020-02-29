package com.example.decorunity.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.decorunity.R;
import com.example.decorunity.data.designArrays;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

//design page
public class FilterActivity extends AppCompatActivity implements View.OnClickListener {
    private Chip chip1,chip2,chip3,chip4,chip5,chip6,chip7,chip8,chip9,chip10;
    private String selectedChip;
    private ImageView favourite_btn,favouriteFall;
    private ChipGroup designsGroup;
    private DesignsAdapter designsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        //Chips
        chip1=findViewById(R.id.bathroom);
        chip2=findViewById(R.id.bedroom);
        chip3=findViewById(R.id.childern_room);
        chip4=findViewById(R.id.dinning_room);
        chip5=findViewById(R.id.hallway);
        chip6=findViewById(R.id.home_office);
        chip7=findViewById(R.id.kitchen);
        chip8=findViewById(R.id.laundry);
        chip9=findViewById(R.id.out_door);
        chip10=findViewById(R.id.storage_room);

        designsGroup=findViewById(R.id.filter_category);

        //Recycler View
        RecyclerView recyclerView = findViewById(R.id.designsRV);
         designsAdapter=new DesignsAdapter();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(designsAdapter);


        chip1.setOnClickListener(this);
        chip2.setOnClickListener(this);
        chip3.setOnClickListener(this);
        chip4.setOnClickListener(this);
        chip5.setOnClickListener(this);
        chip6.setOnClickListener(this);
        chip7.setOnClickListener(this);
        chip8.setOnClickListener(this);
        chip9.setOnClickListener(this);
        chip10.setOnClickListener(this);

        //Chips Checked

        ChipGroup.OnCheckedChangeListener checkedChangeListener=new ChipGroup.OnCheckedChangeListener() {
            @Override
            public  void onCheckedChanged(ChipGroup group, int checkedId) {
                //Log.e("activity_filter", group+"");
                //Toast.makeText(activity_filter.this, checkedId+"", Toast.LENGTH_SHORT).show();
                designsAdapter.notifyDataSetChanged();
            }
        };
        designsGroup.setOnCheckedChangeListener(checkedChangeListener);
    }


    @Override
    public void onClick(View v) {
        final designArrays arrays=new designArrays();

        switch (v.getId()){

            case R.id.bathroom:
                designsAdapter.setList(arrays.getArray1());
                break;
            case R.id.bedroom:
                designsAdapter.setList(arrays.getArray2());
                break;
            case R.id.childern_room:
                designsAdapter.setList(arrays.getArray3());
                break;
            case R.id.dinning_room:
                designsAdapter.setList(arrays.getArray4());
                break;
            case R.id.hallway:
                designsAdapter.setList(arrays.getArray5());
                break;
            case R.id.home_office:
                designsAdapter.setList(arrays.getArray6());
                break;
            case R.id.kitchen:
                designsAdapter.setList(arrays.getArray7());
                break;
            case R.id.laundry:
                designsAdapter.setList(arrays.getArray8());
                break;
            case R.id.out_door:
                designsAdapter.setList(arrays.getArray9());
                break;
            case R.id.storage_room:
                designsAdapter.setList(arrays.getArray10());

                break;

        }
    }
}