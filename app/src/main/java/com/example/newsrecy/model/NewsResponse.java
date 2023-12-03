package com.example.newsrecy.model;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class NewsResponse {

   @SerializedName("status")
   String status;

   @SerializedName("totalResults")
   int totalResults;

   @SerializedName("articles")
   List<Articles> articles;
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    public int getTotalResults() {
        return totalResults;
    }
    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }
    public List<Articles> getArticles() {
        return articles;
    }
    
}