package com.example.restapiandroidproject;

import com.google.gson.annotations.SerializedName;

public class Book {
    @SerializedName("title")
    private String title;
    @SerializedName("author_name")
    private String authorName;
    @SerializedName("cover_i")
    private String cover;
    @SerializedName("number_of_pages_median")
    private String numberOfPages;
}
