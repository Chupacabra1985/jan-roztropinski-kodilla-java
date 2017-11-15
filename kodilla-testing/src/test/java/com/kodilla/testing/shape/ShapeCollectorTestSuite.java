package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
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
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure("Circle");

        //Then
        Assert.assertEquals(1, shapeCollector.getListShapeQuantity());

    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure("Circle");
        int beforeListSize = shapeCollector.getListShapeQuantity();

        //When
        shapeCollector.removeFigure("Circle");
        int afterListSize = shapeCollector.getListShapeQuantity();

        //Then
        Assert.assertNotEquals(beforeListSize,afterListSize);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure("Circle");

        //When
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);

        //Then


    }




}
