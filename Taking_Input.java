import java.util.Scanner; // importing external code for using Scanner class 

public class Taking_Input {
    public static void main(String[] args){
        System.out.println("This is for taking input from user");
        Scanner name = new Scanner(System.in); // System.in for taking input from the keyboard,aka User 
        // System.out.println("Enter num1 ");
        // int a = name.nextInt();
        // float a = name.nextFloat();
        // System.out.println("Enter num2 ");
        // // int b = name.nextInt();
        // float b = name.nextFloat();
        // // int sum = a+b;
        // float sum = a+b;
        // System.out.println("The sum is ");
        // System.out.println(sum); 
        
        // boolean b1 = name.hasNextInt(); // name.hasNextInt() for checking if the expression is an integer or not 
        // System.out.println(b1);

        System.out.println("Enter Expression ");
        // String str = name.next(); // name.next() takes input until a space is detected 
        String str = name.nextLine(); // name.nextLine() takes full input regaardless of the spaces involved  
        System.out.println(str);
    }
}
