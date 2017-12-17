package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        //create books
        Book book1 = new Book("Mały Książę", "Antoine de Saint-Exupéry", LocalDate.of(1943, 12, 25));
        Book book2 = new Book("Cień wiatru", "Carlos Ruiz Zafón",LocalDate.of(1975, 6, 15) );
        Book book3 = new Book("Folwark zwierzęcy", "George Orwell", LocalDate.of(1990, 1,20));

        //create library
        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCloned = null;
        try{
            deepCloned = library.deepCopy();
            deepCloned.setName("Library 3");
        }catch (CloneNotSupportedException e ){
            System.out.println(e);
        }

        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepCloned.getBooks().size());

    }
}
