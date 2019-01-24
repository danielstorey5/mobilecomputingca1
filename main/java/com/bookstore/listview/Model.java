package com.bookstore.listview;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private static Model instance = null;
    private final List<Book> mBooks;

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    private Model() {
        mBooks = new ArrayList<>();
        getBooks().add(new Book(1, "Learning PHP: A Gentle Introduction to the Web's Most Popular Language", "David Sklar", "9781491933572", 2016, 41.99));
        getBooks().add(new Book(2, "Beginning PHP 5.3", "Matt Doyle", "9780470413968", 2009, 36.40));
        getBooks().add(new Book(3, "Beginning JavaScript, 5th Edition", "Jeremy McPeak", "9781118903339", 2015, 40.90));
        getBooks().add(new Book(4, "Learning JavaScript, 3rd Edition", "Ethan Brown", "9781491914915", 2016, 39.99));
        getBooks().add(new Book(5, "100 Things Every Designer Needs to Know About People", "Susan Weinschenk", "9780321767530", 2011, 26.31));
        getBooks().add(new Book(6, "Smashing CSS: Professional Techniques for Modern L", "Eric Meyer", "9780470684160", 2010, 28.90));
        getBooks().add(new Book(7, "HTML5: The Missing Manual, 2nd Edition", "Matthew MacDonald", "9781449363260", 2014, 34.99));
        getBooks().add(new Book(8, "Stylin' with CSS: A Designer's Guide, 3rd Edition", "Charles Wyke-Smith", "9780321858474", 2012, 25.76));
        getBooks().add(new Book(9, "Introducing HTML5, 2nd Edition", "Bruce Lawson", "9780321784421", 2011, 17.95));
        getBooks().add(new Book(10, "CSS: The Missing Manual, 4th Edition", "David Sawyer McFarland", "9781491918050", 2015, 35.72));
        getBooks().add(new Book(11, "HTML5 Foundations", "Matt West", "9781118356555", 2012, 36.55));
    }

    public List<Book> getBooks() {
        return mBooks;
    }

    public Book findBookById(int book_id) {
        Book book = null;
        for (Book b : mBooks) {
            if (b.getId() == book_id) {
                book = b;
                break;
            }
        }
        return book;
    }
}
