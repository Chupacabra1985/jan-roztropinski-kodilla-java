package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TsetingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(4, 5);
        int resultSubstract = calculator.substract(5, 4);

        if (resultAdd == 9) {
            System.out.println("Calculator Add working OK");
        } else {
            System.out.println("Calculator Error Add!");
        }

        if (resultSubstract == 1) {
            System.out.println("Calculator Substract working OK");
        } else {
            System.out.println("Calculator Error Substract!");
        }
    }
}

