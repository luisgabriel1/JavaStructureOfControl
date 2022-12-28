package Udemy;

import java.util.Scanner;

public class Challenge1 {
    
    // Here too it could using the switch cases.

    // Here below have to do equal the example.
    /*
    Example:
    * If enter 1 <- Sunday
    * If enter 2 <- Monday
    * If enter 3 <- Tuesday
    * If enter 4 <- Wednesday
    * If enter 5 <- Thursday
    * If enter 6 <- Friday
    * If enter 7 <- Saturday
    * */

    public static void main(String[] args) {
        Scanner AskTheDay = new Scanner(System.in);

        System.out.print("Which the day ? ");
        String ChoiceTheDay = AskTheDay.nextLine();

        if (ChoiceTheDay.equals("Sunday")){
            System.out.println("You he chose: 1");
        }

        else if (ChoiceTheDay.equals("Monday")){
            System.out.println("You he chose: 2");
        }

        else if (ChoiceTheDay.equals("Tuesday")){
            System.out.println("You he chose: 3");
        }

        else if (ChoiceTheDay.equals("Wednesday")){
            System.out.println("You he chose: 4");
        }

        else if (ChoiceTheDay.equals("Thursday")){
            System.out.println("You he chose: 5");
        }

        else if (ChoiceTheDay.equals("Friday")){
            System.out.println("You he chose: 6");
        }

        else if (ChoiceTheDay.equals("Saturday")){
            System.out.println("You he chose: 7");
        }

        else {
            System.out.println("Sorry I no understood what I meant");
        }

    }
}
