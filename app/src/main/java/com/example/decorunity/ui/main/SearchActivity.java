package com.example.decorunity.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.decorunity.R;
import com.example.decorunity.data.designArrays;
import com.example.decorunity.data.peopleArray;
import com.example.decorunity.data.productArray;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener  {
    private Chip chipDesigns, chipPeople, chipProducts;
    private ChipGroup filter_searchGroup;
    private DesignsAdapter designsAdapter;
    private PeopleAdapter peopleAdapter;
    private ProductsAdapter productsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        chipDesigns = findViewById(R.id.chipDesigns);
        chipPeople = findViewById(R.id.chipPeople);
        chipProducts = findViewById(R.id.chipProducts);
        filter_searchGroup = findViewById(R.id.filter_search);

        //Recycler View
        RecyclerView recyclerView1 = findViewById(R.id.searchRV);
        //  RecyclerView recyclerView2 = findViewById(R.id.searchRV);
        //  RecyclerView recyclerView3 = findViewById(R.id.searchRV);
        designsAdapter = new DesignsAdapter();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        peopleAdapter = new PeopleAdapter();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        productsAdapter = new ProductsAdapter();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));

        // recyclerView1.setAdapter(designsAdapter);
        chipDesigns.setOnClickListener(this);
        //recyclerView1.setAdapter(peopleAdapter);
        chipPeople.setOnClickListener(this);
        // recyclerView1.setAdapter(productsAdapter);
        chipProducts.setOnClickListener(this);
    }
//Searchhhhhhhhhhhhhhhhhhh


    @Override
    public void onClick(View v) {
        final designArrays arrayDessign = new designArrays();
        final peopleArray arrayPeople = new peopleArray();
        final productArray arrayProduct = new productArray();

        RecyclerView recyclerView1 = findViewById(R.id.searchRV);

        switch (v.getId()) {
            case R.id.chipDesigns:
                recyclerView1.setAdapter(designsAdapter);
                designsAdapter.setList(arrayDessign.getArray1());
                // Toast.makeText(searchActivity.this, "55", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chipPeople:
                recyclerView1.setAdapter(peopleAdapter);
                peopleAdapter.setList(arrayPeople.getArray1());
                break;
            case R.id.chipProducts:
                recyclerView1.setAdapter(productsAdapter);
                productsAdapter.setList(arrayProduct.getArray1());
                break;

        }

    }

}