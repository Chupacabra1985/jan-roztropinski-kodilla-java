package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Starting new test");
    }

    @After
    public void after(){
        System.out.println("End test");
    }





    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();


        //When
        oddNumbersExterminator.exterminate(new ArrayList<>());


        //Then
        int  result = oddNumbersExterminator.getNewList().size();
        Assert.assertEquals( 0, result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numberList = new ArrayList<Integer>(
                Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();


        //When
        oddNumbersExterminator.exterminate(numberList);


        //Then
        int result = oddNumbersExterminator.getNewList().size();
        Assert.assertEquals(5, result);

    }





}
