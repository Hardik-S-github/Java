public class Arrays {
    public static void main(String[] args){
        // int []marks; // Declaration
        // marks = new int[5]; // Memory allocation
        // int []marks = new int [5]; // Declaration + Memory allocation
        // marks[0] = 87; --
        // marks[1] = 66;   |
        // marks[2] = 43;   ---- Initailization
        // marks[3] = 55;   | 
        // marks[4] = 78; --

        // int []marks = {87,66,43,55,78}; // Declaration + Initialization

        // for(int i = 0; i<marks.length; i++){
        //     System.out.println(marks[i]); // Array Traversal
        // }

        // for(int i = marks.length-1; i>=0; i--){
        //     System.out.println(marks[i]); // Reverse array traversal
        // }

        String []names = {"Hardik", "Rohan", "Vansh", "Muskan", "Richelle"};

        // for-each loop
        for(String element: names){
            System.out.println(element);
        }   
    }
}
