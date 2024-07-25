import java.util.Scanner;
import java.util.Random;

public class Rock_paper_scissor {
    public static void main(String[] args) {
        int you_win = 0, comp_win = 0;
        int i = 1;
        while (i < 6) {
            System.out.print("Enter your choice (1 - Rock, 2 - Paper, 3 - Scissors): ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            System.out.println("You chose " + choice );
            
            Random random = new Random();
            int comp_choice = random.nextInt(1,3);

            switch(comp_choice){
                case 1 -> System.out.println("Computer - Rock\n");
                case 2 -> System.out.println("Computer - Paper\n");
                case 3 -> System.out.println("Computer - Scissors\n");
                default -> System.out.println("Error");
            
            }

            if(choice == comp_choice){
                System.out.println("Tie\n");
                you_win++;
                comp_win++;
            }
            else if(choice==1 && comp_choice==2){
                System.out.println("Computer won the round\n");
                comp_win++;
            }
            else if(choice==1 && comp_choice==3){
                System.out.println("You won the round!\n");
                you_win++;
            }
            else if(choice==2 && comp_choice==1){
                System.out.println("You won the round!\n");
                you_win++;
            }
            else if(choice==2 && comp_choice==3){
                System.out.println("Compter won the round\n");
                comp_win++;
            }
            else if(choice==3 && comp_choice==1){
                System.out.println("Computer won the round\n");
                comp_win++;
            }
            else if(choice==3 && comp_choice==2){
                System.out.println("You won the round!!");
                you_win++;
            }

            i++;
        }

        if(you_win>comp_win){
            System.out.println("You won the game, Congrats!");
        }
        else if(you_win<comp_win){
            System.out.println("Computer won the game, try again");
        }

    }
}
