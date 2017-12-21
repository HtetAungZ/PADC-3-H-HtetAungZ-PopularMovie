package com.padcmyanmar.popularmovie.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.adapters.MovieDetailsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieDetailActivity extends AppCompatActivity {

        @BindView(R.id.rv_movie)
    RecyclerView recyclerView;

    private MovieDetailsAdapter movieDetailsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this,this);

        movieDetailsAdapter=new MovieDetailsAdapter();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(movieDetailsAdapter);





    }



}
