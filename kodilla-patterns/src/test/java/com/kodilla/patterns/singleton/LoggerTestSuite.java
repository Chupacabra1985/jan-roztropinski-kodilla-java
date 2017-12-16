package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLog(){
        Logger.getInstance().log("NewLog");
    }

    @Test
    public void testGetLog(){
        //Given
        //When
        String result = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("NewLog", result);
    }
}
