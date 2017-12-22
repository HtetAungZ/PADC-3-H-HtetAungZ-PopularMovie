package com.padcmyanmar.popularmovie.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.adapters.MovieDetailsAdapter;
import com.padcmyanmar.popularmovie.adapters.MovieGenresAdapter;
import com.padcmyanmar.popularmovie.adapters.MovieReviewsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieDetailActivity extends AppCompatActivity {

    @BindView(R.id.rv_tralier)
    RecyclerView rvtralier;

    @BindView(R.id.rv_genres)
    RecyclerView rvgenres;

    @BindView(R.id.rv_reviews)
    RecyclerView rvreviews;

    private MovieDetailsAdapter movieDetailsAdapter;
    private MovieGenresAdapter movieGenresAdapter;
    private MovieReviewsAdapter movieReviewsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this, this);

        movieDetailsAdapter = new MovieDetailsAdapter();
        LinearLayoutManager moviedetail = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvtralier.setLayoutManager(moviedetail);
        rvtralier.setAdapter(movieDetailsAdapter);


        movieGenresAdapter = new MovieGenresAdapter();
        LinearLayoutManager moviegenres = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        rvgenres.setLayoutManager(moviegenres);
        rvgenres.setAdapter(movieGenresAdapter);

        movieReviewsAdapter = new MovieReviewsAdapter();
        LinearLayoutManager moviereviews= new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        rvreviews.setLayoutManager(moviereviews);
        rvreviews.setAdapter(movieReviewsAdapter);



    }


}
