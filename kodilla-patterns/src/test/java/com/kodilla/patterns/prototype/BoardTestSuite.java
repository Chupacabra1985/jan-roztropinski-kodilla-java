package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString(){
        //Given
        //creating the TasksList for todos
        TasksList listToDo = new TasksList("To Do Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n->listToDo.getTasks().add(new Task("In Progress Task number " +n)));
        //creating the TaskList for done tasks
        TasksList listInProgress = new TasksList("In Porgress Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n->listInProgress.getTasks().add(new Task("In Progress Task number " +n)));
        //creating the TaskList for done tasks
        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n->listDone.getTasks().add(new Task("Done Task number " +n)));

        //creating the board and assinging the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making a shallow clone of object board
        Board clonedBoard = null;
        try{
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy of object board
        Board deepCloneBoard = null;
        try{
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project number 3");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepCloneBoard);
        Assert.assertEquals(2,board.getLists().size());
        Assert.assertEquals(2,clonedBoard.getLists().size());
        Assert.assertEquals(3,deepCloneBoard.getLists().size());
        Assert.assertEquals(clonedBoard.getLists(), board.getLists());
        Assert.assertNotEquals(deepCloneBoard.getLists(),board.getLists());
    }
}
