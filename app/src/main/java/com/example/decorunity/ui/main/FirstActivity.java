package com.example.decorunity.ui.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.decorunity.R;
import com.example.decorunity.data.RVClick;
import com.example.decorunity.data.designArrays;
import com.example.decorunity.pojo.DesignModel;

import java.util.List;

public class FirstActivity extends AppCompatActivity implements RVClick {
    private DesignsAdapter designsAdapter= new DesignsAdapter(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        RecyclerView recyclerView = findViewById(R.id.designsRV);

        final designArrays designArrays = new designArrays();
        designsAdapter.setList(designArrays.getArray1());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(designsAdapter);

        //designsAdapter= new DesignsAdapter(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                startActivity(new Intent(FirstActivity.this, SearchActivity.class));

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this,"CLICKED "+position, Toast.LENGTH_SHORT).show();

    }


}