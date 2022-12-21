package Udemy;

public class For3 {

    // Here have two ties For one inside the other.
    // I used variables ordinary.


    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();

        }
    }
}
