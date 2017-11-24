package com.kodilla.stream.array;
import org.junit.Assert;
import org.junit.Test;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite{
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers;                    // declare the array
        numbers = new int[20];             // create the array
        for (int i =0; i < 20; i++) {    // elements are indexed
            numbers[i] = i;
        }


        //When
        double average = ArrayOperations.getAverege(numbers);

        IntStream.rangeClosed(numbers[0],numbers[19])
                .forEach(System.out::println);


        //Then
        Assert.assertEquals(9.5,average,0.1);

    }
}
