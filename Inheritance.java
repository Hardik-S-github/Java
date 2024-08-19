class Base{ // Base class OR Parent class OR Super class 
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Accessing setter from Base class");
        this.x = x;
    }

    public void print(){
        System.out.println("This is a constructor");
    }
}

// Inheritance 
class Derived extends Base{ // Derived class OR Child class OR Sub class 
    int y;

    public void setY(int y) {
        System.out.println("Accessing setter from the Derived class");
        this.y = y;
    }

    public int getY() {
        return y;
    }
} 

public class Inheritance {
    public static void main(String[] args) {
        Base i = new Base();
        i.setX(20);
        System.out.println(i.getX());

        Derived j = new Derived();
        j.setX(80);
        System.out.println(j.getX());
        j.setY(100);
        System.out.println(j.getY());
    }
}
