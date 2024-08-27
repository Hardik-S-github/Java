import java.util.Scanner;
import java.util.Random;

class Game{
    public int num_gen;
    public int ip;
    public int number_of_guesses = 0;

    public void setNumber_of_guesses(int number_of_guesses) {
        this.number_of_guesses = number_of_guesses;
    }

    public int getNumber_of_guesses() {
        return number_of_guesses;
    }

    Game(){
        Random rdm = new Random();
        System.out.println("Generating number..");
        this.num_gen = rdm.nextInt(0,100);
    }

    void user_input(){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        ip = sc.nextInt();
    }

    boolean is_correct(){
        number_of_guesses++;
        if(ip==num_gen){
            System.out.printf("You got it, it was %d\nGuessed in %d attempts",num_gen, number_of_guesses);
            return true;
        }
        else if(ip<num_gen){
            System.out.println("Too low, try for a higher number");
        }
        else if(ip>num_gen){
            System.out.println("Too high, try for a lower number");
        }
        return false;
    }
}

public class Guess_the_number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.user_input();
            b = g.is_correct();
        }
    }   
}
