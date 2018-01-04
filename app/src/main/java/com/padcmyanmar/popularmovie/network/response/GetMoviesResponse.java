package com.padcmyanmar.popularmovie.network.response;

import com.google.gson.annotations.SerializedName;
import com.padcmyanmar.popularmovie.data.vo.PopularMoviesVO;

import java.util.List;

/**
 * Created by ICE on 03-01-2018.
 */

public class GetMoviesResponse {

private int code;
private String message;
private String apiVersion;
private String page;
@SerializedName("popular-movies")
private List<PopularMoviesVO> popularMovies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<PopularMoviesVO> getPopularMovies() {
        return popularMovies;
    }
}
