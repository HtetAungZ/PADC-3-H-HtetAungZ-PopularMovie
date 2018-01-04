package com.padcmyanmar.popularmovie.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.data.vo.PopularMoviesVO;
import com.padcmyanmar.popularmovie.delegates.MoviesActionDelegate;
import com.padcmyanmar.popularmovie.viewholders.ItemMoviesViewHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by ICE on 07-12-2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<ItemMoviesViewHolder> {


    private MoviesActionDelegate mmoviesActionDelegate;
    private List<PopularMoviesVO> mMoviesList;

    public MoviesAdapter(MoviesActionDelegate moviesActionDelegate) {
        mmoviesActionDelegate = moviesActionDelegate;
        mMoviesList = new ArrayList<>();
    }


    @Override
    public ItemMoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View moviesItemView = inflater.inflate(R.layout.item_movie, parent, false);
        ItemMoviesViewHolder itemMoviesViewHolder = new ItemMoviesViewHolder(moviesItemView, mmoviesActionDelegate);
        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemMoviesViewHolder holder, int position) {

        holder.setMovies(mMoviesList.get(position));
    }

    @Override
    public int getItemCount() {
        return mMoviesList.size();
    }

    public void setMovies(List<PopularMoviesVO> moviesList) {

        mMoviesList = moviesList;
        notifyDataSetChanged();
    }
}
