package com.kodilla.rps;

import java.util.Scanner;
import java.util.Random;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int comScore=0;
        int userScore = 0;
        int rounds = 0;

        boolean startGame = false;
        boolean newGame = false;

        System.out.println("Hello my Friend!");

        System.out.println("Write my your name: ");
        String name = keyboard.nextLine();
        boolean nameTrue = name.length()>=3;

        if(nameTrue==true) {
            System.out.println("Do you want to start a new game? (Y/N)");
            String play = keyboard.nextLine();
            startGame = play.equals("Y");}
            if(startGame == true) {
                System.out.println("How many rounds: ");
               rounds = keyboard.nextInt();
               newGame = rounds>0;
            }
            if(newGame==true){

            while (startGame && comScore<rounds && userScore<rounds){
                System.out.println("Enter 1 for ROCK, 2 for PAPER, 3 for SCISSORS, x for END GAME, n NEW GAME");
                int user = keyboard.nextInt();
                int comp = rand.nextInt(2) + 1;
                System.out.println("I draw: " + comp);
                if((user==1 && comp==3)||(user==2 && comp==1)||(user==3 && comp==2)){
                    System.out.println("You win!");
                    userScore++;
                }else if ((user==1 && comp==2)||(user==2 && comp==3)||(user==3 && comp==1)){
                    System.out.println("I win!");
                    comScore++;
                }

                System.out.println("SCORE  you: " + userScore + " my: " + comScore);
            }

            if(comScore > userScore){
                System.out.println("I bet you!");
            }else {
                System.out.println("You beat me!");
            }
        }

    }


}
