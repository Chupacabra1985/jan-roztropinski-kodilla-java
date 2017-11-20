package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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


        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfpublication()>2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        Map<Integer, ForumUser> theForumReslut =  forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsQuantity()>=1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        System.out.println("# elements: " + theForumReslut.size());
        theForumReslut.entrySet().stream()
                .map(entry->entry.getValue())
                .forEach(System.out::println);

    }

}
