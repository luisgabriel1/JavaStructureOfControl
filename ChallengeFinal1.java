package Udemy;

import java.util.Scanner;

public class ChallengeFinal1 {

    // The problem is: Create one program as receive one number the verification if he is between 0 and 10 the is pair.

    public static void main(String[] args) {
        Scanner InformNumber = new Scanner(System.in);

        System.out.print("Please inform a number: ");
        double QuestionNumber = InformNumber.nextDouble();

        if (QuestionNumber >= 0 && QuestionNumber <= 10 && QuestionNumber % 2 == 0){
            System.out.println("This is number is pair.");

        }
        else {
            System.out.println("This is number is odd and is not between: ");
        }

        InformNumber.close();

    }
}
