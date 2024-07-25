import java.util.Scanner;

public class practice2 {
    public static void main(String[] args){
        Scanner string = new Scanner(System.in);
        // System.out.print("Enter your income: ");
        // int tax_paid = tax.nextInt();

        // if(tax_paid>250000 && tax_paid<500000){
        //     System.out.println("5% paid");
        // }
        // else if(tax_paid>500000 && tax_paid<1000000){
        //     System.out.println("20% paid");
        // }
        // else{
        //     System.out.println("30% paid");
        // }

        System.out.println("Enter the website link: ");
        String website = string.nextLine();

        if(website.endsWith(".com")){
            System.out.println("This is a commercial website.");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an organisation website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
    }
}
