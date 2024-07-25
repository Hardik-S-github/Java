import java.util.Scanner;

public class practice_sheet {
    public static void main(String[] args) {
        // ************* Problem 1 - Sum of the elements in the array *************
        // float []nums = new float[5];
        // nums[0] = 12.9f;
        // nums[1] = 34.7f;
        // nums[2] = 54.89f;
        // nums[3] = 2.8f;
        // nums[4] = 10.9f;

        // float sum = 0;

        // for(int i=0; i<nums.length; i++){
        // sum +=nums[i];
        // }

        // System.out.println("The sum of this array is " + sum);



        // ************* Problem 2 - Finding an element in the array *************
        // int[] nums = new int[5];
        // nums[0] = 12;
        // nums[1] = 34;
        // nums[2] = 54;
        // nums[3] = 2;
        // nums[4] = 10;

        // int present = 88;
        // int i = 0;

        // while (i < nums.length) {
        // if (present == nums[i])
        // System.out.println("Element found at " + (i + 1) + "th " + "position");
        // i++;
        // }
        // System.out.println("Element not present");



        // ************* Problem 3 - Find average of marks obtained by students *************
        // float[] marks = new float[5];
        // marks[0] = 50.5f;
        // marks[1] = 45.5f;
        // marks[2] = 40.5f;
        // marks[3] = 20.0f;
        // marks[4] = 32.0f;

        // float sum = 0.0f;

        // for(float element: marks){
        // sum += element;
        // }
        // float avg = (sum/5);
        // System.out.println("The total marks = " + sum);
        // System.out.println("The average marks = " + avg);



        // ************* Problem 4 - Adding two matrices of order 2X3 *************
        // int[][] num1 = new int [2][3];
        // num1[0][0] = 1;
        // num1[0][1] = 2;
        // num1[0][2] = 3;
        // num1[1][0] = 4;
        // num1[1][1] = 5;
        // num1[1][2] = 6;

        // int[][] num2 = new int [2][3];
        // num2[0][0] = 7;
        // num2[0][1] = 8;
        // num2[0][2] = 9;
        // num2[1][0] = 10;
        // num2[1][1] = 11;
        // num2[1][2] = 12;

        // for(int i = 0; i<num1.length; i++){
        // for (int j = 0; j < num1[i].length; j++) {
        // int sum = num1[i][j] + num2[i][j];
        // System.out.print(sum);
        // System.out.print("\t");
        // }
        // System.out.println();
        // }



        // ************* Problem 5 - Reversing an array *************
        /*
         * int[] arr = new int[5];
         * arr[0] = 1;
         * arr[1] = 2;
         * arr[2] = 3;
         * arr[3] = 4;
         * arr[4] = 5;
         * int l = arr.length;
         * int mid = (l/2);
         * int temp;
         * 
         * for(int element: arr){
         * System.out.print(element + " ");
         * }
         * 
         * for(int i = 0; i<mid; i++){
         * temp = arr[i];
         * arr[i] = arr[l-1-i];
         * arr[l-1-i] = temp;
         * }
         * 
         * System.out.println();
         * for(int element: arr){
         * System.out.printf(element + " ");
         * }
         */



        // *********** Problem 6 - Finding the larget element in the array ***********
        /*
         Scanner sc = new Scanner(System.in);
         int[] element = new int[5];
         for(int j = 0; j<element.length; j++){
         System.out.print("Enter the " + (j+1) + "th " + "element: ");
         element[j] = sc.nextInt();
         }
         
         int max_element = element[0];
         for(int i = 0; i<element.length; i++){
         if(element[i]>max_element){
         max_element = element[i];
         }
         }
         System.out.println("The larget element is " + max_element);
         */



        // *********** Problem 7 - Finding the smallest element in the array ***********
        /*
        Scanner sc = new Scanner(System.in);
         int[] element = new int[5];
         for(int j = 0; j<element.length; j++){
         System.out.print("Enter the " + (j+1) + "th " + "element: ");
         element[j] = sc.nextInt();
         }
         
         int min_element = element[0];
         for(int i = 0; i<element.length; i++){
         if(element[i]<min_element){
         min_element = element[i];
         }
         }
         System.out.println("The smallest element is " + min_element);
        */

    }
}
