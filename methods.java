public class methods {
    static int logic(int x, int y){
        int z;
        if(x>y)
            z = (x+y)*5;
        else
            z = (x+y)+4;
        
        return z;
    }
    public static void main(String[] args){
        int a,b,a1,b1,c,c1;
        a = 2;
        b = 5;

        // methods obj = new methods(); // If static is not used, an object of the class needs to be created  
        // c = obj.logic(a,b); // Accessing the method through the object
        c = logic(a,b); // Accessing the method without the object
        System.out.println(c);
        
        a1 = 2;
        b1 = 1;
        // c1 = obj.logic(a1,b1); // Accessing the method throught the object 
        c1 = logic(a1,b1); // Accessing the method without the object 
        System.out.println(c1);
    }
}
