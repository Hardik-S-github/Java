import java.util.Scanner;

public class Recursion_factorial{
    // Recursive approach
    static int factorial(int n){
        if (n==1 || n==0)
            return 1;
        else 
            return n * factorial(n-1);
    } 

    // Iterative approach
    static int factorial_iterative(int n){
        if(n==1 || n==0){
            return 1;
        }

        else{
            int product = 1;
            for(int i=n; i>0; i--){
                product*= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        // Recursive approach
        System.out.println("The factorial of " + x + " is " + factorial(x));

        // Iterative approach
        System.out.println("The factorial of " + x + " by iterative approach is " + factorial_iterative(x));
    }
}