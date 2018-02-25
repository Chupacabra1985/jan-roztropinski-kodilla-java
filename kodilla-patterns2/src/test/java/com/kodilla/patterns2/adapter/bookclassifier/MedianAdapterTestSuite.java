package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){

        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Book book1 = new Book("Author1", "Title1", 2010, "12586");
        Book book2 = new Book("Author2", "Title2", 2000, "86542");
        Book book3 = new Book("Author3", "Title3", 1995, "78963");
        Book book4 = new Book("Author4", "Title4", 1990, "85296");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        //When
        int result = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2000, result);
    }
}
