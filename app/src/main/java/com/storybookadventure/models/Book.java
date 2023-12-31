package com.storybookadventure.models;

public class Book {

    private int book_id;
    private int book_rating;
    private String book_name;
    private String author_name;
    private String book_image;
    private String book_short_description;

    public Book() {
    }

    public Book(int book_id, int book_rating, String book_name, String author_name, String book_image, String book_short_description) {
        this.book_id = book_id;
        this.book_rating = book_rating;
        this.book_name = book_name;
        this.author_name = author_name;
        this.book_image = book_image;
        this.book_short_description = book_short_description;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getBook_rating() {
        return book_rating;
    }

    public void setBook_rating(int book_rating) {
        this.book_rating = book_rating;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getBook_image() {
        return book_image;
    }

    public void setBook_image(String book_image) {
        this.book_image = book_image;
    }

    public String getBook_short_description() {
        return book_short_description;
    }

    public void setBook_short_description(String book_short_description) {
        this.book_short_description = book_short_description;
    }
}
