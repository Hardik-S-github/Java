public class Operators {
    public static void main(String[] args){
        // Arithematic operator 
        int a = 90,b = 100,result;  // = is Assignment operator 
        result = b - a;
        System.out.println(result);  

        // Comparison operators 
        System.out.println(a==b);      
        System.out.println(a>=b);      
        System.out.println(a<=b);      
        System.out.println(a<b);      
        System.out.println(a>b);  
        
        // Logical operators 
        System.out.println(a<b && 120>10);
        System.out.println(a<b && 1>10);
        System.out.println(a>=b || 120>10);
        System.out.println(a>=b || 10>10);

        // Bitwise operators ----> converts the given number to its binary form and then compares 
        System.out.println(2&3);

            //     10  (2)
            //   & 11  (3)
            // -----------
            //     10  (2)
            

        System.out.println(2|3);

            //     10  (2)
            //   | 11  (3)
            // -----------
            //     11  (3)


    
        // Presedence, Associativity and use of parenthesis is same as it was in C++. 
        }
}
