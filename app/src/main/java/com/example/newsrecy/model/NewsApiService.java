package com.example.newsrecy.model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsApiService {
//    @GET("top-headlines?country=us&apiKey=f78349e172ef4979ae8e88bc510ad4c9")
    @GET("top-headlines?country=in&apiKey=f78349e172ef4979ae8e88bc510ad4c9")

    Call<NewsResponse> getTopHeadlines();
}
