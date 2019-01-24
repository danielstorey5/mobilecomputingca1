/* A package organizes a group of classes and interfaces that are related. Here our package is com.bookstore.listview. */
package com.bookstore.listview;

/* Necessary imports for our program. */
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/*
We are calling the getBooks() function from our model.java class later in the MainActivity class. As our books there are
stored in a list, we need to also call it here.
*/

import java.util.List;

/*
The main class of our program called MainActivity. AppCompatActivity is a set of support libraries which essentially
make apps developed with a newer version of android work with older versions of android. We implement ItemListener
as we need to process data from the BookListFragment class to display the books.
*/
public class MainActivity extends AppCompatActivity implements BookListFragment.ItemListener {

    //Boolean will be used to test if books are being loaded in.
    private boolean mTwoPane;

    //Override methods ensure that the compiler is a method of a super class. If it is not; it will throw an error.
    @Override

    //onCreate is called when an activity is created in the program.
    // setContentView is used to set the xml.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        If there is a result for findViewById - the mTwoPane variable is set to true and the
        proceeding if statement is ran.
        */
        mTwoPane = (findViewById(R.id.book_details_two_pane) != null);

        //All books from the books array list (from Model.java) are displayed if mTwoPane is true.
        if (mTwoPane) {
            List<Book> books = Model.getInstance().getBooks();
            if (!books.isEmpty()) {
                Book book = Model.getInstance().getBooks().get(0);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.add(R.id.book_details_two_pane, BookDetailFragment.newInstance(book.getId()));
                ft.commit();
            }
        }
    }

    @Override
    public void itemSelected(Book b) {
        if (mTwoPane) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

            ft.replace(R.id.book_details_two_pane, BookDetailFragment.newInstance(b.getId()));
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, BookDetailActivity.class);
            intent.putExtra(BookDetailFragment.EXTRA_BOOK_ID, b.getId());

            startActivity(intent);
        }
    }
}
