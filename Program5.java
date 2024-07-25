import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
        // int i = 12;
        // while(i>0){
        //     System.out.println("10 * " + i + " = " + (10*i));
        //     i--;
        // }

        // int pro = 1;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //     pro*=i;
        // }
        // System.out.println("Factorial of " + n + " = " + pro);

        int sum = 0;
        for(int i = 1; i<11;i++){
            int result = 8*i;
            sum += result;
        }
        System.out.println("Sum of the products from the table of 8 = " + sum);
    }
}
