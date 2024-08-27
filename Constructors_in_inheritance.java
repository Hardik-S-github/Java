class Base1{
    Base1(){
        System.out.println("This is a constructor");
    }

    Base1(int x){
        System.out.println("This is a base class overloaded constructor with value of x as " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        super(23); // For accessing and printing the base contructor with the parameter, i.e., 23   
        System.out.println("This is a derived class constructor");
    }

    Derived1(int x, int y){
        super(x); // Searches for the value of x from the parameters given, if not, takes the value specified in super
        System.out.println("This is a derived class overloaded constructor with value y as " + y);
    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("This is the constructor of childOfDerived");
    }

    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("This is a childOfDerived class overloaded constructor with value of z as " + z);
    }
}

public class Constructors_in_inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Base1 b = new Base1(542);
        // Derived1 d = new Derived1(14, 15); 
        // Derived1 d1 = new Derived1(); 
        childOfDerived cod = new childOfDerived(14, 15, 16); 
        // childOfDerived cod1 = new childOfDerived(); 
    }
}
