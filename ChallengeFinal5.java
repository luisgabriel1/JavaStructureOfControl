package Udemy;

import java.util.Scanner;

public class ChallengeFinal5 {

    // Refactor the ChallengeFinal4, using the structure (switch).

    public static void main(String[] args) {

        Scanner RequestPrimeNumbers = new Scanner(System.in);

        System.out.print("Inform your number: ");
        int QuestionPrimeNumbers = RequestPrimeNumbers.nextInt();

        switch (QuestionPrimeNumbers){
            case 1:
                System.out.println("This is number not prime number. ");
                break;
            default:
                System.out.println("This is number is prime number. ");
                break;
        }

        RequestPrimeNumbers.close();

    }
}
