package com.ichorafas.guessgame.main;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        int x = (int) (Math.floor(Math.random() * 10) + 1);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello lets play a game");
        System.out.println("Would you like to play a game, Yes or No ?");
        String answer = myObj.next();
        if ("Yes".equals(answer) || "YES".equals(answer) || "yes".equals(answer)) {
            
            System.out.println("You will have to guess a number from 0 to 10 ");
            int number = myObj.nextInt();
            int a = 1;
            
            for (int i = 0; i < 6; i++) {
                if (x == number) {
                    System.out.println("Congrats you won");
                    break;
                } else {
                    if (a < 6) {
                        if (a == 5) {
                            System.out.println("Carefull this is your last try");
                            number = myObj.nextInt();
                            a = a + 1;
                        } else {
                            int tries = 5 - a;
                            if (number < x) {
                                System.out.println("Try guessing a little higher : " + tries + " more tries ");
                            } else if (number > x) {
                                System.out.println("Try guessing a little lower : " + tries + " more tries ");
                            }
                            a = a + 1;
                            number = myObj.nextInt();
                        }
                    } else {
                        System.out.println("I am sorry you lost ");
                        break;
                    }
                }
            }
            
        } else if ("NO".equals(answer) || "No".equals(answer) || "no".equals(answer)) {
            System.out.println("Sorry to bother you");
        }
    }

}
