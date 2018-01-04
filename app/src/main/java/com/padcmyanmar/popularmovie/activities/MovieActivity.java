package com.padcmyanmar.popularmovie.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.padcmyanmar.popularmovie.PopularMoviesApp;
import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.adapters.MoviesAdapter;
import com.padcmyanmar.popularmovie.data.models.MoviesModel;
import com.padcmyanmar.popularmovie.delegates.MoviesActionDelegate;
import com.padcmyanmar.popularmovie.events.LoadedMoviesEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieActivity extends AppCompatActivity implements MoviesActionDelegate {

    @BindView(R.id.rv_movies)
    RecyclerView rvmovies;


    private MoviesAdapter moviesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);


        ButterKnife.bind(this, this);
        moviesAdapter = new MoviesAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);


        rvmovies.setLayoutManager(linearLayoutManager);
        rvmovies.setAdapter(moviesAdapter);

        MoviesModel.getsObjectInstance().loadMovies();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }



    @Override
    public void onTapMoviesItem() {

        Intent intent = new Intent(getApplicationContext(), MovieDetailActivity.class);
        startActivity(intent);


    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewsLoaded(LoadedMoviesEvent event) {
        Log.d(PopularMoviesApp.Log_TAG,"onNewsLoaded :"+ event.getMovieslist().size());
        moviesAdapter.setMovies(event.getMovieslist());
    }



}
