package Udemy;

import java.util.Scanner;

public class ChallengeWhile1 {

    // To do one program using (while) and finished when inform "End".

    public static void main(String[] args) {

        Scanner Questions = new Scanner(System.in);

        while (true){

            System.out.print("Report anything: ");
            String Respond = Questions.nextLine();

            if (Respond.equals("End")){
                System.out.println("Finished");
                Questions.close();
                break;
            }

        }
    }
}
