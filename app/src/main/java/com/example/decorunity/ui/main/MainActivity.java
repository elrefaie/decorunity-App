package com.example.decorunity.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.decorunity.R;

public class MainActivity extends AppCompatActivity {

  //  PostViewModel postViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      /*  postViewModel = ViewModelProviders.of(this).get(PostViewModel.class);

        RecyclerView recyclerView = findViewById(R.id.recycler_designs);
        PostsAdapter adapter = new PostsAdapter();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);*/
    }
}
