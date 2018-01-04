package com.padcmyanmar.popularmovie.events;

import com.padcmyanmar.popularmovie.data.vo.PopularMoviesVO;

import java.util.List;

/**
 * Created by ICE on 03-01-2018.
 */

public class LoadedMoviesEvent {


    private List<PopularMoviesVO> movieslist;

    public LoadedMoviesEvent(List<PopularMoviesVO> movieslist){this.movieslist=movieslist;}

    public List<PopularMoviesVO> getMovieslist() {
        return movieslist;
    }
}
