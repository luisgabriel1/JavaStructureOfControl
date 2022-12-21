package Udemy;

import java.util.Scanner;
public class ChallengeFinal8 {

    // Create a program that receive a word and print at the console Word per word.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra: ");
        String palavra = scanner.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        scanner.close();
    }
}
