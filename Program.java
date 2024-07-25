import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.println("This program is to calculate marks and percentage of the subjects");

        System.out.print("\nEnter the maximum marks: ");
        Scanner max_marks = new Scanner(System.in);
        int max = max_marks.nextInt();

        System.out.println("\nEnter the marks of the subjects:-");
        Scanner marks = new Scanner(System.in);

        // Maths 
        System.out.print("Maths: ");
        int maths = marks.nextInt();
        double maths_per = (maths*100)/max;
        
        // Physics
        System.out.print("Physics: ");
        int phy = marks.nextInt();
        double phy_per = (phy*100)/max;
        
        // Chemistry
        System.out.print("Chemistry: ");
        int chem = marks.nextInt();
        double chem_per = (chem*100)/max;
        
        // Electronics
        System.out.print("Electronics: ");
        int elec = marks.nextInt();
        double elec_per = (elec*100)/max;
        
        // English
        System.out.print("English: ");
        int eng = marks.nextInt();
        double eng_per = (eng*100)/max;
        
        
        System.out.println("The marks of Maths are " + maths);
        System.out.println("Percentage obtained in Maths = " + maths_per + "%");

        System.out.println("The marks of Physics are " + phy);
        System.out.println("Percentage obtained in Physics = " + phy_per + "%");
        
        System.out.println("The marks of Chemistry are " + chem);
        System.out.println("Percentage obtained in Chemistry " + chem_per + "%");
        
        System.out.println("Percentage obtained in Electronics = " + elec_per +"%");
        System.out.println("The marks of Electronics are " + elec);

        System.out.println("The marks of English are " + eng);
        System.out.println("Percantage obtained in English " + eng_per + "%");

        
        // Total 
        double total_marks = (maths + phy + chem + elec + eng);
        System.out.println("The total marks obtained = " + total_marks);
        double total = ((maths + phy + chem + elec + eng)*100)/(max*5);
        System.out.println("The total % obtained = " + total + "%");
    }
}
