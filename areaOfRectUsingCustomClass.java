class Rectangle{
    int l;
    int b;
    int area;

    public int area_rect(int l, int b){
        System.out.print("The area = ");
        return l*b;
    }
}

public class areaOfRectUsingCustomClass {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        
        rect1.l = 10;
        rect1.b = 7;
        System.out.println("Length = " + rect1.l);
        System.out.println("Breadth = " + rect1.b);
        System.out.println(rect1.area_rect(rect1.l,rect1.b));

        System.out.println();
        
        rect2.l = 20;
        rect2.b = 10;
        System.out.println("Length = " + rect2.l);
        System.out.println("Breadth = " + rect2.b);
        System.out.println(rect1.area_rect(rect2.l,rect2.b));

    }
}
