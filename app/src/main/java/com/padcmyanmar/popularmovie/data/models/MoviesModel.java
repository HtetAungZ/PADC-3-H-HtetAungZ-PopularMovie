package com.padcmyanmar.popularmovie.data.models;

import com.padcmyanmar.popularmovie.network.HttpUrlConnectionDataAgent;
import com.padcmyanmar.popularmovie.network.MoviesDataAgent;

/**
 * Created by ICE on 03-01-2018.
 */

public class MoviesModel {

    private static MoviesModel sObjectInstance;
    private MoviesDataAgent mDataAgent;


    private MoviesModel() {

        mDataAgent= HttpUrlConnectionDataAgent.getsObjectInstance();

    }

    public static MoviesModel getsObjectInstance() {
        if(sObjectInstance==null)
        {
            sObjectInstance=new MoviesModel();
        }
        return sObjectInstance;
    }


    public void loadMovies()
    {
        mDataAgent.loadMovies();
    }

}
