package com.example.restapiandroidproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;

public class BookDetailsActivity extends AppCompatActivity {
    public static final String EXTRA_BOOK_DETAILS_TITLE = "book_title";
    public static final String EXTRA_BOOK_DETAILS_AUTHOR = "book_author";
    public static final String EXTRA_BOOK_DETAILS_COVER_ID = "book_cover_id";

    private TextView bookTitleTextView;
    private TextView bookAuthorTextView;
    private ImageView bookCoverImageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        bookTitleTextView = findViewById(R.id.book_title);
        bookAuthorTextView = findViewById(R.id.book_author);
        bookCoverImageView = findViewById(R.id.book_cover);

        Intent intent = getIntent();

        String bookTitle = intent.getStringExtra(EXTRA_BOOK_DETAILS_TITLE);
        String bookAuthor = intent.getStringExtra(EXTRA_BOOK_DETAILS_AUTHOR);
        String bookCoverId = intent.getStringExtra(EXTRA_BOOK_DETAILS_COVER_ID);

        if (bookTitle != null) {
            bookTitleTextView.setText(bookTitle);
        }

        if (bookAuthor != null) {
            bookAuthorTextView.setText(bookAuthor);
        }

        if (bookCoverId != null) {
            Picasso.with(this).load("http://covers.openlibrary.org/b/id/" + bookCoverId + "-L.jpg").into(bookCoverImageView);
        }
    }
}