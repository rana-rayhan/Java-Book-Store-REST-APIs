package com.bookapi.bookrestapi.model;

import jakarta.persistence.*;

@Entity
public class BookModel {
    @Id
    private int id;
    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    private AuthorModel author;

    public BookModel() {
    }

    public BookModel(int id, String title, AuthorModel author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorModel getAuthor() {
        return author;
    }

    public void setAuthor(AuthorModel author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookModel [id=" + id + ", title=" + title + ", author=" + author + "]";
    }

}
