package Udemy;

import java.util.Scanner;

public class ChallengeWhile2 {

    // The problem is to do average grades of group of students but no the amount fixed, using (while).
    // The stop or quit is: -1
    // The output is: average grades of group.


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int AmountOfGrade = 0;
        double Grade = 0;
        double Total = 0;

        while (Grade != -1){
            System.out.print("Inform the grade: ");
            Grade = in.nextDouble();

            if(Grade >= 0 && Grade <= 10){

                Total += Grade;
                AmountOfGrade++;

            }


        }

        double average = Total / AmountOfGrade;
        System.out.println("Average = " + average);

        in.close();
    }



    }

