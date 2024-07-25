public class variable_args {
    /*
     static int sum(int ...arr){ // Var args prevents method overloading
        // Parameters passed as an array
        int result = 0;
        for(int element: arr){
            result+=element;
        }
        return result;
     
    }
    */

    static int sum(int x, int ...arr){ // atleat one parameter required to run this method
        int result = x;
        for(int element: arr){
            result+=element;
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println("The sum of Nothing is: " + sum());
        System.out.println("The sum of 2 is: " + sum(2));
        System.out.println("The sum of 2,5 is: " + sum(2, 5));
        System.out.println("The sum of 2,5,8 is: " + sum(2, 5, 8));
        System.out.println("The sum of 2,5,8,7 is: " + sum(2, 5, 8, 7));
    }
}
