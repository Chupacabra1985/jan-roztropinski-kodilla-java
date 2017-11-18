package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Before
    public void before() {
        System.out.println("Starting test.");
    }

    @After
    public void after() {
        System.out.println("End test.");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle());

        //Then
        Assert.assertEquals(1, shapeCollector.getListShapeQuantity());

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle());


        //When
        boolean result = shapeCollector.removeFigure(new Circle());


        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getListShapeQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle());

        //When
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(new Circle(), retrievedFigure);

    }

}
