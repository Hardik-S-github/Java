import java.util.Scanner;

public class Recursion{
    static int factorial(int n){
        if (n==1 || n==0)
            return 1;
        else 
            return n * factorial(n-1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.println("The factorial of " + x + " is " + factorial(x));
    }
}