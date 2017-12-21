package com.padcmyanmar.popularmovie.activities;

import android.content.Intent;
import android.net.LinkAddress;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.adapters.MoviesAdapter;
import com.padcmyanmar.popularmovie.delegates.MoviesActionDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieActivity extends AppCompatActivity implements MoviesActionDelegate{

    @BindView(R.id.rv_movies)
    RecyclerView recyclerView;


    private MoviesAdapter moviesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);


        ButterKnife.bind(this,this);
        moviesAdapter=new MoviesAdapter(this);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);


        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(moviesAdapter);

    }

    @Override
    public void onTapMoviesItem() {

        Intent intent= new Intent(getApplicationContext(),MovieDetailActivity.class);
        startActivity(intent);



    }
}
