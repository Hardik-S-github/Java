class Employee{ // Creating class 
    int id;
    String name;
    int salary;
    String details;
    public void printdet(){
        System.out.println("My name is " + name);
        System.out.println("My id is " + id);
    }

    public int getSalary(){
        return salary;
    }

    public String getDetails(){
        return details;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        Employee Hardik = new Employee(); // Instantiating a new Employee **Object**
        Employee Rohan = new Employee(); 

        // Setting Attributes
        Hardik.id = 12;
        Hardik.name = "Hardik";
        Hardik.salary = 1200000;
        Hardik.details = "Hardik studies engineering";


        Rohan.id = 1098;
        Rohan.name = "Rohan";
        Rohan.salary = 130000;
        Rohan.details = "Rohan too studies engineering";

        // Printing Attributes
        Hardik.printdet(); // Printing with the help of methods defined in the custom class
        int salary2 = Hardik.getSalary();
        String details2 = Hardik.getDetails();
        System.out.println(details2);
        System.out.println(salary2);

        System.out.println();

        Rohan.printdet();

        int salary = Rohan.getSalary();
        String details = Rohan.getDetails();
        System.out.println(details);
        System.out.println(salary);

        // System.out.println(Hardik.id);
        // System.out.println(Hardik.name);
    }
}
