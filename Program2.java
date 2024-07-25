import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        // Scanner number = new Scanner(System.in);
        // double a,b,c,sum;
        // System.out.print("Enter num1: ");
        // a = number.nextDouble();

        // System.out.print("Enter num2: ");
        // b = number.nextDouble();

        // System.out.print("Enter num3: ");
        // c = number.nextDouble();

        // sum = a+b+c;

        // System.out.println("Sum = " + sum);

        // Scanner dist = new Scanner(System.in);
        // double km,mile;
        // System.out.print("Enter distance in kms: ");
        // km = dist.nextDouble();
        // mile = km/0.621371;
        // System.out.println("The distance in miles = " + mile);

        Scanner check = new Scanner(System.in);
        System.out.print("Enter the number: ");
        // int num = check.nextInt();
        boolean b1 = check.hasNextInt(); 
        System.out.println(b1);
    }
}
