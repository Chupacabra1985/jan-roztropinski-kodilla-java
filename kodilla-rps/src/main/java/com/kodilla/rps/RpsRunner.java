package com.kodilla.rps;

import java.util.Scanner;
import java.util.Random;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int comScore = 0;
        int userScore = 0;
        int rounds = 0;

        boolean isRunning = false;
        boolean newGame = false;

        System.out.println("Hello my Friend!");

        System.out.println("Write my your name: ");
        String name = keyboard.nextLine();
        boolean nameTrue = name.length() >= 3;

        if (nameTrue == true) {
            System.out.println("Do you want to start a new game? (Y/N)");
            String play = keyboard.nextLine();
            isRunning = play.equalsIgnoreCase("Y");
        }
        if (isRunning == true) {
            System.out.println("How many rounds: ");
            rounds = Integer.parseInt(keyboard.nextLine());
            isRunning = rounds > 0;
        }


        while (isRunning) {
            System.out.println("Enter 1 for ROCK, 2 for PAPER, 3 for SCISSORS, x for END GAME, n NEW GAME");
            String user = keyboard.nextLine();
            if (user.equalsIgnoreCase("X")) {
                System.out.println("Do you really want to end the game? (Y/N)");
                String close = keyboard.nextLine();
                if (close.equalsIgnoreCase("Y")) {
                    System.out.println("Goodbye!");
                    System.exit(0);
                } else {
                    continue;
                }
            } else if (user.equalsIgnoreCase("N")) {
                System.out.println("Do you really want to end current game? (Y/N)");
                String reloadGame = keyboard.nextLine();
                if (reloadGame.equalsIgnoreCase("Y")) {
                    userScore = 0;
                    comScore = 0;
                    continue;
                } else {
                    continue;
                }
            } else if (isEquals(user)) {
                int comp = rand.nextInt(2) + 1;
                System.out.println("I draw: " + comp);
                if (userWin(user, comp)) {
                    System.out.println("You win!");
                    userScore++;
                } else if (compWin(user, comp)) {
                    System.out.println("I win!");
                    comScore++;
                }

                System.out.println("SCORE  you: " + userScore + " my: " + comScore);
            }

            if (isGameFinised(comScore, userScore, rounds)) {

                if (comScore > userScore) {
                    System.out.println("I bet you!");
                } else {
                    System.out.println("You beat me!");
                }

                System.out.println("Do you want to play again? (Y/N)");
                String play = keyboard.nextLine();
                if (play.equalsIgnoreCase("y")) {
                    userScore = 0;
                    comScore = 0;

                } else {
                    System.out.println("See you next time!");
                    isRunning = false;
                }
            }
        }


    }

    private static boolean compWin(String user, int comp) {
        return (user.equals("1") && comp == 2) || (user.equals("2") && comp == 3) || (user.equals("3") && comp == 1);
    }

    private static boolean userWin(String user, int comp) {
        return (user.equals("1") && comp == 3) || (user.equals("2") && comp == 1) || (user.equals("3") && comp == 2);
    }

    private static boolean isEquals(String user) {
        return user.equals("1") || user.equals("2") || user.equals("3");
    }

    private static boolean isGameFinised(int comScore, int userScore, int rounds) {
        return comScore >= rounds || userScore >= rounds;
    }
}


