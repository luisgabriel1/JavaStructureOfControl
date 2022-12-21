package Udemy;

import java.util.Scanner;

public class ChallengeFinal2 {

    // Create a program inform if the year current is leap year.

    public static void main(String[] args) {

        Scanner QuestionHowManyDay = new Scanner(System.in);

        System.out.print("How many days have this year: ");
        int RespondHowManyDays = QuestionHowManyDay.nextInt();

        if (RespondHowManyDays == 366){
            System.out.println("This is a leap year ");
        }

        else if (RespondHowManyDays == 365){
            System.out.println("This is normal year ");
        }

        else {
            System.out.println("Sorry inform the days of year please");
        }

        QuestionHowManyDay.close();

    }
}
