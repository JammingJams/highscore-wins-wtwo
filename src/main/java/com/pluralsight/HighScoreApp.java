package com.pluralsight;

import java.util.Scanner;

public class HighScoreApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please put in a score for the game: ");
        String userGameScore = sc.nextLine();

        String[] tempUser = userGameScore.split( "[:|]");

        int numOne = Integer.parseInt(tempUser[2]);
        int numTwo = Integer.parseInt(tempUser[3]);

        if (numOne > numTwo) {
            System.out.printf("Winner: %s",tempUser[0]);
        }
        else if (numOne == numTwo) {
            System.out.println("Nobody wins");
        }
        else {
            System.out.printf("Winner: %s",tempUser[1]);
        }

    }
}
