package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().addTask("Watch TV");
        board.getInProgressList().addTask("Relax");
        board.getDoneList().addTask("Read the book");

        //When
        int toDoList = board.getToDoList().tasks.size();
        int inProgressList = board.getInProgressList().tasks.size();
        int doneList = board.getDoneList().tasks.size();

        //Then
        Assert.assertEquals(1, toDoList);
        Assert.assertEquals(1, inProgressList);
        Assert.assertEquals(1, doneList);
        System.out.println(board.getToDoList().tasks.get(0).toString());
        System.out.println(board.getInProgressList().tasks.get(0).toString());
        System.out.println(board.getDoneList().tasks.get(0).toString());
    }
}
