package com.padcmyanmar.popularmovie.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.delegates.MoviesActionDelegate;
import com.padcmyanmar.popularmovie.viewholders.ItemMoviesDetailsViewHolder;
import com.padcmyanmar.popularmovie.viewholders.ItemMoviesViewHolder;


/**
 * Created by ICE on 14-12-2017.
 */

public class MovieDetailsAdapter extends RecyclerView.Adapter{




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View moviesItemView=inflater.inflate(R.layout.activity_movie_detail_images,parent,false);
        ItemMoviesDetailsViewHolder itemMoviesDetailsViewHolder=new ItemMoviesDetailsViewHolder(moviesItemView);



        return itemMoviesDetailsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
