package Udemy;

import java.util.Scanner;

public class ChallengeFinal4 {

    // Create a program to receive one number the say is he is one prime number.

    public static void main(String[] args) {

        Scanner RequestPrimeNumbers = new Scanner(System.in);

        System.out.print("Inform your number: ");
        int QuestionPrimeNumbers = RequestPrimeNumbers.nextInt();

        if (QuestionPrimeNumbers > 1){
            System.out.println("This is a prime number ");

        }

        RequestPrimeNumbers.close();

    }
}
