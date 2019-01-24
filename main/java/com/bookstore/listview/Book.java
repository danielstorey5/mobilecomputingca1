package com.bookstore.listview;


/*
This class is used as a blueprint for our books; which will be hard-coded in later under our Model.java class.
The variables below refer to the values that all of are books will hold.
*/
class Book {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private int year;
    private double price;

    //Constructor for our Book class: will be called in Model.java to hard-code a selection of books.
    public Book(int id, String title, String author, String isbn, int year, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    /*
    A collection of get and set methods for each variable stored in whatever book object is in context.
    In object orientated programming - most classes will have get and set methods: they enable outside methods
    to either retrieve specific variables from the class instance (get) or change a specific variable in the
    class instance/object (set).
    */

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
