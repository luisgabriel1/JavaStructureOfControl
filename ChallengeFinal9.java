package Udemy;

import java.util.Scanner;

public class ChallengeFinal9 {

    // Create a program that receive 10 values and to final print the max number.

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in);



        int MaxValue = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Inform values: ");
            int ValuesUser = Values.nextInt();
            if (MaxValue < ValuesUser){
                MaxValue = ValuesUser;
            }


        }
        System.out.println(MaxValue);

    }
}
