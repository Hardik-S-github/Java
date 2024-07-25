import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        char grade = 'A';
        // Encryption
        grade = (char)(grade + 8); // Typecasting int to char
        System.out.println(grade);

        // Decryption 
        grade = (char)(grade - 8);
        System.out.println(grade);

        
        int num = 10;
        System.out.print("Enter the number to be checked: ");
        Scanner user_num = new Scanner(System.in);
        int user = user_num.nextInt();
        System.out.println(num>user);

        int a = 7*49/7+35/7;
        System.out.println("The value of a is " + a);
    }
}
