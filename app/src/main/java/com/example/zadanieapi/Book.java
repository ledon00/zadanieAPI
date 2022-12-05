package com.example.zadanieapi;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Book  implements Serializable{
    @SerializedName("title")
    private String title;
    @SerializedName("author_name")
    private List<String> authors;
    @SerializedName("cover_i")
    private String cover;
    @SerializedName("number_of_pages_median")
    private String numberOfPages;
    @SerializedName("language")
    private List<String> languages;
    @SerializedName("publisher")
    private List<String> publishers;
    @SerializedName("ebook_count_i")
    private String ebookcount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getEbookcount(){
        return this.ebookcount;
    }
    public void setEbookcount(String ebook ){
        this.ebookcount=ebook;
    }

    public List<String> getLanguages() {
        return languages;
    }
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getPublishers() {
        return publishers;
    }
    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }
}
