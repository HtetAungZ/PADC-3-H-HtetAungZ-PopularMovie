package com.padcmyanmar.popularmovie.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.viewholders.ItemMoviesViewHolder;

import java.util.zip.Inflater;

/**
 * Created by ICE on 07-12-2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter{


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View moviesItemView= inflater.inflate(R.layout.item_movie,parent,false);
        ItemMoviesViewHolder itemMoviesViewHolder=new ItemMoviesViewHolder(moviesItemView);


        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
