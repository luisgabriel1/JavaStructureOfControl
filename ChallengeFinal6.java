package Udemy;

import java.util.Random;
import java.util.Scanner;

public class ChallengeFinal6 {

    // Guessing game: Try to guess a number between 0 - 100. Store a random number in a variable. The Player has 10 attempts to guess the generated number. At the end of each attempt, print the number of remaining attempts, and print whether the entered number is greater or less than the stored number.

    public static void main(String[] args) {

        Random RequestRandomNumber = new Random();
        Scanner RequestNumberUser = new Scanner(System.in);

        int CountAttempt = 10;

        int RandomNumber = RequestRandomNumber.nextInt(101);

        for (int count = 10; count >= 1; count--) {
            CountAttempt--;

            System.out.print("\nGuess the number 0 - 100:  ");
            int NumberUser = RequestNumberUser.nextInt();
            System.out.println();

            if (NumberUser == RandomNumber) {
                System.out.println("Congratulations. ");
            }

            else {
                System.out.println("Try one more time.");
                System.out.printf("You have %d attempt. \n", CountAttempt);
            }


        }
        RequestNumberUser.close();
    }
}
