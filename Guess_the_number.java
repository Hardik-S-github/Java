import java.util.Random;
import java.util.Scanner;

class game{
    private int num;
    private int numberOfGuesses = 0;
    public game(){
        Random rdm = new Random();
        num = rdm.nextInt(10);
    }

    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

    public void isCorrectNumber(int n){
        if(n<num){
            System.out.println("Choose a higher number");
            numberOfGuesses++;
        }
        
        else if(n>num){
            System.out.println("Choose a lower number");
            numberOfGuesses++;
        }
        
        else if(n==num){
            System.out.println("Good job! You won");
            numberOfGuesses++;
        }
    }
}

public class Guess_the_number {
    public static void main(String[] args) {
        game 
    }   
}
