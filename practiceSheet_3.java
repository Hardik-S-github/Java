class Rectangle{
    private int length, breadth;

    public Rectangle(){
        length = 4;
        breadth = 3;
    }

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    public Rectangle(int l){
        length = l;
        breadth = 3;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }
}

public class practiceSheet_3 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(3, 4);
        Rectangle rect3 = new Rectangle(4);

        System.out.println("The length of rect1 are: " + rect1.getLength());
        System.out.println("The breadth of rect1 are: " + rect1.getBreadth());

        System.out.println("The length of rect2 are: " + rect2.getLength());
        System.out.println("The breadth of rect2 are: " + rect2.getBreadth());

        System.out.println("The length of rect3 are: " + rect3.getLength());
        System.out.println("The breadth of rect3 are: " + rect3.getBreadth());
    }
}
