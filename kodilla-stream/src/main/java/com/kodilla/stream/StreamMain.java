package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        System.out.println("Poem Beautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Wykrzyknik",tekst -> "! "+tekst+" !");
        poemBeautifier.beautify("Litery",tekst -> "ABC "+tekst+" ABC");
        poemBeautifier.beautify("Rownosc", tekst -> "=="+tekst+"==");
        poemBeautifier.beautify("duze litery", tekst -> tekst.toUpperCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }

}
