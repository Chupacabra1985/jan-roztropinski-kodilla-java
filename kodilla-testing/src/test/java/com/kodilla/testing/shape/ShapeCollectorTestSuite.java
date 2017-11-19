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
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.getListShapeQuantity());

    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);


        //When
        boolean result = shapeCollector.removeFigure(circle);


        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getListShapeQuantity());
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);

        //When
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle, retrievedFigure);

    }

}
