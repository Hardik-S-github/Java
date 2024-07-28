import java.util.Scanner;

public class fibonacci {
    static int Rec_fibonacci(int n){
        if(n<=1){
            return n;
        }
        int x = Rec_fibonacci(n-1) + Rec_fibonacci(n-2);
        return x;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = 10;
        // System.out.print("Enter the position: ");
        System.out.println(Rec_fibonacci(6));
        
    }
}
