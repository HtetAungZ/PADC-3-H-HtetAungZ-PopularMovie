package com.padcmyanmar.popularmovie.viewholders;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.popularmovie.R;
import com.padcmyanmar.popularmovie.activities.MovieDetailActivity;
import com.padcmyanmar.popularmovie.delegates.MoviesActionDelegate;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ICE on 07-12-2017.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder{


    private MoviesActionDelegate mmoviesActionDelegate;

    public ItemMoviesViewHolder(View itemView,MoviesActionDelegate moviesActionDelegate) {
        super(itemView);

        mmoviesActionDelegate=moviesActionDelegate;
        ButterKnife.bind(this,itemView);




    }

@OnClick(R.id.cv_movies_item_root)
public void onTapMoviesItem()
{
        mmoviesActionDelegate.onTapMoviesItem();
}


}

