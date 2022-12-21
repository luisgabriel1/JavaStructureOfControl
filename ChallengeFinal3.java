package Udemy;

import java.util.Scanner;

public class ChallengeFinal3 {

    /*
      Create a program that receive two grade partial, calculation the average final.
      If the grade of student is  >= 7.0 output is: "Okay"
      If the grade of student is  < 7.0  && > 4.0 output is: "Recuperation"
    */


    public static void main(String[] args) {

        Scanner RequestGradesStudents = new Scanner(System.in);

        System.out.print("What's your grade: ");
        double QuestionGradeStudent = RequestGradesStudents.nextDouble();

        if(QuestionGradeStudent >= 7.0){
            System.out.println("Okay");
        }
        else if(QuestionGradeStudent < 7.0 && QuestionGradeStudent > 4.0){
            System.out.println("Recuperation");
        }
        else{
            System.out.println("Sorry your grade not passed");
        }

        RequestGradesStudents.close();
    }
}
