import java.util.Scanner;

public class DIM2_array_user_input {
    public static void main(String[] args) {
        int [][]A = new int[2][2];
        int [][]B = new int[2][2];
        int [][]C = new int[2][2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of matrix A: ");
        for (int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the values of matrix B: ");
        for (int i=0; i<B.length; i++){
            for(int j=0; j<B[i].length; j++){
                B[i][j] = sc.nextInt();
            }
        }
    }
}
