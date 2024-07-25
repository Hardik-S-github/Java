import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args){
    // Right angle triangle
    // for (int i = 1; i <= 5; i++) {
    //   for (int j = 1; j <= i; j++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }


    // Inverted right angle triangle
    // for (int i = 5; i>0 ;i--){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // Inverted right angle triangle using while loop
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number rows: ");
    int n = sc.nextInt();
    int i = n;
    while(i>0){
        int j = 1;
        while(j<=i){
            j++;
            System.out.print("* ");
        }
        i--;
        System.out.println();
    }

    // Right aligned right angle triangle
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    //     // Print spaces for right alignment
    //     for (int j = 0; j < n - i; j++) {
    //         System.out.print(" ");
    //     }

    //     // Print stars
    //     for (int k = 0; k < i; k++) {
    //         System.out.print("*");
    //     }

    //     System.out.println(); // Move to the next line
    // }
    }
}
