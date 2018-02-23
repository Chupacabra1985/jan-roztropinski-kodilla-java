package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorksTestSuite {
    @Test
    public void testTasksInfo(){
        //Given
        Works johnKovalsky = new JohnKovalsky();
        Works mikeSmith = new MikeSmith();
        Works susanBoyle = new SusanBoyle();

        Mentor jackMalik = new Mentor("Jack Malik");
        Mentor tomSoprano = new Mentor("Tom Soprano");

        johnKovalsky.registerMentor(jackMalik);
        mikeSmith.registerMentor(tomSoprano);
        susanBoyle.registerMentor(tomSoprano);

        //When
        johnKovalsky.addTask("Task1 to check");
        mikeSmith.addTask("Task1 to check");
        susanBoyle.addTask("Task1 to check");
        johnKovalsky.addTask("Task2 to check");
        johnKovalsky.addTask("Task3 to check");

        //Then
        assertEquals(3, jackMalik.getUpdateCount());
        assertEquals(2, tomSoprano.getUpdateCount());
    }
}
