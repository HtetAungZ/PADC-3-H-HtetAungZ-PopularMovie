package com.padcmyanmar.popularmovie.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.viewholders.ItemMoviesReviewsViewHolder;

/**
 * Created by ICE on 22-12-2017.
 */

public class MovieReviewsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context= parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View moviereviews= layoutInflater.inflate(R.layout.item_review,parent,false);
        ItemMoviesReviewsViewHolder itemMoviesReviewsViewHolder= new ItemMoviesReviewsViewHolder(moviereviews);

        return  itemMoviesReviewsViewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
