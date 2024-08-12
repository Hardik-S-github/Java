import java.util.Scanner;

class Complex_number{
    private float num1, num2;
    private float sum;




    public Complex_number(float n1, float n2){
        num1 = n1;
        num2 = n2;
    }

    public Complex_number(){
        num1 = 12;
        num2 = 13;
    }




    public float calculate(){
        sum = num1 + num2;
        return sum;
    }
}

public class constructorOverloading {
    public static void main(String[] args) {
        Complex_number sum2 = new Complex_number();
        System.out.println("Sum = " + sum2.calculate());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num_1: ");
        float number_1 = sc.nextFloat();
        System.out.print("Enter num_2: ");
        float number_2 = sc.nextFloat();

        Complex_number sum3 = new Complex_number(number_1, number_2);
        System.out.println("Sum = " + sum3.calculate());
    }
}
