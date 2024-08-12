class Cylinder{
    private int rad, height;
    private double pi = 3.14;

    public Cylinder(int r, int h){
        rad = r;
        height = h;
    }

    // public void setRadius(int r){
    //     rad = r;
    // }

    public int getRadius(){
        return rad;
    }

    // public void setHeight(int h){
    //     height = h;
    // }

    public int getHeight(){ 
        return height;
    }

    public double surfaceArea(double r, double h){
        return ((2*pi*r*h) + (2*pi*r*r));
    }

    public double volume(double r, double h){
        return pi*r*r*h;
    } 
}

public class practiceSheet_2{
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(20,30);

        // c1.setRadius(20);
        int Radius = c1.getRadius();
        System.out.println("The radius of the cylinder is: " + Radius);

        // c1.setHeight(30);
        int Heigth = c1.getHeight();
        System.out.println("The height of the cylinder is: " + Heigth);

        // double SurfaceArea = c1.surfaceArea(2.3, 3.9);
        // System.out.println("The surface area is: " + SurfaceArea);

        // double Volume = c1.volume(2.3, 3.9);
        // System.out.print("The surface area is: " + Volume);
    }
}