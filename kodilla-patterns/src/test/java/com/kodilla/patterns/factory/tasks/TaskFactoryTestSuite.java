package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testSoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("I'm buying: Chocolate", shopping.executeTask());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);

        //Then
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("I'm painting: Wall color: Red", painting.executeTask());
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);

        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("I'm driving: Car to: Poznań", driving.executeTask());

    }
}
