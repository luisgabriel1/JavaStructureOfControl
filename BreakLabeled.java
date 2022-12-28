package Udemy;

public class BreakLabeled {
    public static void main(String[] args) {
        
        // Here below i using two ties for one inside the other. And using the break for stop ties extern.
        
        Extern: for(int i = 0; i < 3; i++){
            Intern: for(int j = 0; j < 3; j++){
                if (i == 1){
                    break Extern;
                }
            }
        }
    }
}
