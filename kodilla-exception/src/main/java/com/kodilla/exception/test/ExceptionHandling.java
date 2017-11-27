package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling{

    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
                try{
                    String result = secondChallenge.probablyIWillThrowException(1.5, 2.0);
                    System.out.println(result);
                }catch (IOException e){
                    throw new Exception();
                }finally {
                    System.out.println("Finally");
                }
    }

}
