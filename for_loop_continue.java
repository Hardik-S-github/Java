import java.util.Scanner;;

public class for_loop_continue {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the limit: ");
        // int n = sc.nextInt();
        // for(int i = 0; i<n ; i++){
        //     if(i%2 != 0){
        //         System.out.println(i);
        //     }

        for (int i = 0; i<5; i++){
            if(i==3)
                continue;
            System.out.println("Hello World! - " + i);
        }
        }
    }
