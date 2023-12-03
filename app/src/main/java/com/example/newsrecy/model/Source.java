package com.example.newsrecy.model;

import com.google.gson.annotations.SerializedName;

   
public class Source {

   @SerializedName("id")
   String id;

   @SerializedName("name")
   String name;





    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
}