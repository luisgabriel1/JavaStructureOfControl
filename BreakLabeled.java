package Udemy;

public class BreakLabeled {
    public static void main(String[] args) {
        Extern: for(int i = 0; i < 3; i++){
            Intern: for(int j = 0; j < 3; j++){
                if (i == 1){
                    break Extern;
                }
            }
        }
    }
}
