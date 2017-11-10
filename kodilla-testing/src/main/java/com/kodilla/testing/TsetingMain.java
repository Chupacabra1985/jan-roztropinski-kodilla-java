package com.kodilla.testing;

import com.kodilla.testing.Calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TsetingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        }else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(4,5);
        int resultSubstract = calculator.substract(4,5);

        if(resultAdd>resultSubstract){
            System.out.println("Calculator working OK");
        }else{
            System.out.println("Calculator Error!");
        }
    }
}
