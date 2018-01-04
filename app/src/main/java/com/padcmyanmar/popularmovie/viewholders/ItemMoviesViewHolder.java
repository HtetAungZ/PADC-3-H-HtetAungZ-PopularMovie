package com.padcmyanmar.popularmovie.viewholders;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padcmyanmar.popularmovie.PopularMoviesApp;
import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.activities.MovieDetailActivity;
import com.padcmyanmar.popularmovie.data.vo.PopularMoviesVO;
import com.padcmyanmar.popularmovie.delegates.MoviesActionDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ICE on 07-12-2017.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder {


    private MoviesActionDelegate mmoviesActionDelegate;


    @BindView(R.id.tv_movie_title)
    TextView tvmovieTitle;


    @BindView(R.id.tv_movie_genre)
    TextView tvmovieGenre;

    @BindView(R.id.tv_rating)
    TextView tvrating;

    @BindView(R.id.iv_movie_poster)
    ImageView ivmoviePoster;

//    @BindView(R.id.rb_popularity)
//    RatingBar rbpopularity;


    public ItemMoviesViewHolder(View itemView, MoviesActionDelegate moviesActionDelegate) {
        super(itemView);

        mmoviesActionDelegate = moviesActionDelegate;
        ButterKnife.bind(this, itemView);


    }

    @OnClick(R.id.cv_movies_item_root)
    public void onTapMoviesItem() {
        mmoviesActionDelegate.onTapMoviesItem();
    }



    public void setMovies(PopularMoviesVO movies) {

        tvmovieTitle.setText(movies.getTitle());

        tvrating.setText(String.valueOf(movies.getVoteAverage()));


        Glide.with(ivmoviePoster.getContext())
                .load(movies.getPosterPath())
                .into(ivmoviePoster);



    }








}

