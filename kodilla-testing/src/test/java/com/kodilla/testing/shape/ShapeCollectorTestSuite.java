package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Before
    public void before(){
        System.out.println("Starting test.")
    }

    @After
    public void after(){
        System.out.println("End test.")
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape shape = new Shape(Circle);

        //When
        shapeCollector.addFigure(shape);


    }

}
