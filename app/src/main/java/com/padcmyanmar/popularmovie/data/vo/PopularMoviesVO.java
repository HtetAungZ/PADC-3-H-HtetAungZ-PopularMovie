package com.padcmyanmar.popularmovie.data.vo;

import java.util.List;

/**
 * Created by ICE on 21-12-2017.
 */

public class PopularMoviesVO {

    private int Id;
    private boolean video;
    private int voteCount;
    private double voteAverage;
    private String title;
    private double popularity;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private List<Integer> genresIds;
    private String backdropPath;
    private boolean adult;
    private String overview;
    private String releaseDate;



    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return Id;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public List<Integer> getGenresIds() {
        return genresIds;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }



}
