package Udemy;

import java.util.Scanner;

public class ChallengeFinal7 {

    // Create a program that, while receiving positive numbers, prints the sum of the entered numbers to the console, if you receive a negative number, close the program. Try using the while structure.

    public static void main(String[] args) {

        int calculation = 0;

        Scanner RequestNumberAll = new Scanner(System.in);

        while (true){
            System.out.print("Inform a number: ");
            int NumbersAll = RequestNumberAll.nextInt();

            if (NumbersAll >= 0){
                calculation += NumbersAll;

            }

            else {
                System.out.println("Finished\n");
                System.out.printf("The calculation is: %d", calculation);
                break;
            }
        }
        RequestNumberAll.close();



    }
}
