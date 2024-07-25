public class method_overloading {
    static void joke(){
        System.out.println("This is a joke");
    }

    static void change(int a){
        a = 88;
    }

    static void change2(int [] arr){
        arr[0] = 9;
    }

    static void greet(){
        System.out.println("Hi man!");
    }

    static void greet(int a){
        System.out.println("Hi " + a + " man!");
    }

    static void greet(int a, int b){
        System.out.println("Hi " + a + " man!");
        System.out.println("Hi " + b + " man!");
    }
    public static void main(String[] args){
        joke();
        
        // Case 1: Changing the integer
        /* 
        int x = 3;
        change(x);
        System.out.println("The value of x after running change is: " + x);
        */
        
        // Case 2: Changing the array
        /*
        int[] marks = {45, 65, 89, 94, 78, 77};
        change2(marks); // The value of marks[0] is changed because "marks" is a refernce which is passed to the method change2 (Like Call by reference in C & C++)
        System.out.println("The value of marks[0] after running change2 is: " + marks[0]);
        */


        // Method Overloading - running different methods with the same name but different arguments and parameters 
        greet();
        greet(900);
        greet(900, 700);

    }
}
