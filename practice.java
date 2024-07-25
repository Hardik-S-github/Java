import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        // int a = 11;
        // if (a == 11){
        //     System.out.println("You're 11");
        // }
        // else {
        //     System.out.println("You're 10");
        // }

        Scanner marks = new Scanner(System.in);

        System.out.print("Enter marks of Physics: ");
        float phy = marks.nextFloat();
        float phy_per = (phy*100)/60;
        
        System.out.print("Enter marks of Maths: ");
        float maths = marks.nextFloat();
        float maths_per = (maths*100)/60;
        
        System.out.print("Enter marks of IT: ");
        float it = marks.nextFloat();
        float it_per = (it*100)/60;
        
        System.out.println("Percentage obtained in Physics = " + phy_per + "%");
        System.out.println("Percentage obtained in Maths = " + maths_per + "%");
        System.out.println("Percentage obtained in IT = " + it_per + "%");

        if(phy_per < 33){
            System.out.println("Failed in Physics");
        }
        
        else if(maths_per < 33){
            System.out.println("Failed in Maths");
        }
        
        else if(it_per < 33){
            System.out.println("Failed in It");
        }
        
        float total_per;
        total_per = ((maths + phy + it) * 100) / 180;
        
        if(total_per < 40   ||   phy_per < 33   ||   maths_per < 33   ||   it_per < 33){
            System.out.println("Failed");
        }
        
        else{
            float total = (maths + phy + it);
            System.out.println("Total marks obtained = " + total);
            System.out.println("Total percentage obtained = " + total_per + "%");
            System.out.println("Pass");
        }
    }
}
