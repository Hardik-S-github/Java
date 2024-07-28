import java.util.Scanner;

public class Practice3 {
    // sum (n) = 1 + 2 + 3 + 4 +... + n
    // sum (n) = 1 + 2 + 3 + .... n-1 + n
    // sum (n) = sum(n-1) + n
    // sum (3) = 3 + sum(2)
    // sum (3) = 3 + 2 + sum(1)
    // sum (3) = 3 + 2 + 1
    static int sum(int n){
        // Base condition - to terminate the method at the last element
        if(n==1)
            return 1;
        else
            return n + sum(n-1);
    }

    static void pattern(int n){
        for (int i = n; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int avg(int... arr){
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            count++;
        }
        int sum = 0;
        for(int j = 0; j<arr.length; j++){
            sum += arr[j];
        }
        return sum/count;
    }

    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for(int i = 0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Problem 1 Calculating the sum of first "n" natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int num = sc.nextInt();

        System.out.println(sum(num));


        // Problem 2 - inverted star pattern
        pattern(5);

        
        // Problem 3 - finding average of numbers 
        int x = avg(3,5);
        System.out.println(x);


        // Problem 4
        pattern_rec(5);
    }
}
