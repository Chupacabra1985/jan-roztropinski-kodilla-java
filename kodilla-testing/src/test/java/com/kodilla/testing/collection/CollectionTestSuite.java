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



    ArrayList<Integer> numberList = new ArrayList<Integer>(
            Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        numberList.clear();
        System.out.println("Elements in numberList: " + numberList.size());
        Integer listSize = numberList.size();
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(numberList);

        //When
        Integer result = oddNumbersExterminator.getNewList().size();
        System.out.println("Elements in newList: " + oddNumbersExterminator.getNewList().size());

        //Then
        Assert.assertEquals(listSize, result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        System.out.println("Elements in numberList: " + numberList.size());
        Integer listSize = numberList.size();

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(numberList);

        //When
        Integer result = oddNumbersExterminator.getNewList().size();
        System.out.println("Elements in newList: " + oddNumbersExterminator.getNewList().size());
        for(Integer element: numberList){
            System.out.println("Element in numberList: " + element);
        }

        for(Integer newElement: oddNumbersExterminator.getNewList()){
            System.out.println("Element in newList: " + newElement);
        }

        //Then
        Assert.assertNotEquals(listSize, result);

    }





}
