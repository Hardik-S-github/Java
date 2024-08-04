import java.util.Scanner;

class Emp{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public String setName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String new_name = sc.nextLine();
        return new_name;
    }
}



class cellphone{
    int action;

    public String function_of_mobile(int number){
        if(number == 1){
            return "Ringing...";
        }

        else if(number == 2){
            return "Vibrating...";
        }

        else{
            return "displaying a notification...";
        }
    }
}


class TommyVercetti{
    public void hit(){
        System.out.println("Hitting....");
    }

    public void run(){
        System.out.println("Running....");
    }

    public void fire(){
        System.out.println("Firing....");
    }
}
public class practice_4 {
    public static void main(String[] args) {
        //Problem 1
        Emp emp1 = new Emp();

        emp1.salary = 10000;
        emp1.name = "John";
        System.out.println("The name is " + emp1.getName());
        System.out.println("The salary of " + emp1.getName() + " is " + emp1.getSalary());

        // Changing the name
        String changed_name = emp1.setName();
        System.out.println("The new name is " + changed_name);
        


        // Problem 2 
        Scanner sc1 = new Scanner(System.in);
        cellphone mobile = new cellphone();
        System.out.println("Enter the action (1. Ringing   2. Vibrating   3. Notification)");
        mobile.action = sc1.nextInt();

        System.out.println("The phone is " + mobile.function_of_mobile(mobile.action));
        


        // Problem 3
        TommyVercetti action = new TommyVercetti();
        action.hit();
        action.fire();
        action.run();
    }
}
