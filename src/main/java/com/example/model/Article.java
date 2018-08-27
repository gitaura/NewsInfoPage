package com.example.model;

import java.util.Date;

public class Article {

    private int id;
    private Date date;
    private String title;
    private String content;
    private String img;
    private Category category;

    public Article() {
    }

    public Article setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Article(int id, Date date, String title, String content, String img, Category category) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.content = content;
        this.img = img;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public Article setId(int id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Article setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Article setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Article setContent(String content) {
        this.content = content;
        return this;
    }

    public String getImg() {
        return img;
    }

    public Article setImg(String img) {
        this.img = img;
        return this;
    }

    public Category getCategory() {
        return category;
    }

}
