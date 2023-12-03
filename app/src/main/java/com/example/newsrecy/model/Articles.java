package com.example.newsrecy.model;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class Articles {

   @SerializedName("source")
   Source source;

   @SerializedName("author")
   String author;

   @SerializedName("title")
   String title;

   @SerializedName("description")
   String description;

   @SerializedName("url")
   String url;

   @SerializedName("urlToImage")
   String urlToImage;

   @SerializedName("publishedAt")
   Date publishedAt;

   @SerializedName("content")
   String content;





    public void setSource(Source source) {
        this.source = source;
    }
    public Source getSource() {
        return source;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    
    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
    public String getUrlToImage() {
        return urlToImage;
    }
    
    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }
    public Date getPublishedAt() {
        return publishedAt;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }


}