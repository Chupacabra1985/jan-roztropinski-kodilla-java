package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {

    @Test
    public void testGetListUsingFor(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numbersOfBooksPublicatedAfter2007 = 0;
        for(Book book : books){
            if(book.getYearOfpublication()>2007){
                numbersOfBooksPublicatedAfter2007++;
            }
        }

        Assert.assertEquals(3,numbersOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        long numbersBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n->books.get(n).getYearOfpublication()>2007)
                .count();
        Assert.assertEquals(3,numbersBooksPublicatedAfter2007);

    }
}
