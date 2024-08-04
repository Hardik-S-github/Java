class Circle{
    private float r, area, circumference;
    float pi = 3.14f;

    public void setRadius(float radius){
        r = radius;
    }

    public float getRadius(){
        return r;
    }

    public void setArea(float radius){
        area = pi*(radius*radius);
    }

    public float getArea(){
        return area;
    }

    public void setCircumference(float radius){
        circumference = 2*pi*radius;
    }

    public float getCircumference(){
        return circumference;
    }
}

public class Trying {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(20.2f);
        System.out.println("The radius of the circle is " + c1.getRadius());

        c1.setArea(20.2f);
        System.out.printf("The area of circle is %.4f", c1.getArea());

        System.out.println();

        c1.setCircumference(20.2f);
        System.out.printf("The circumference of the circle is %.4f", c1.getCircumference());
    }
}
