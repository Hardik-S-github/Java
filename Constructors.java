class Employee_constructor{
    private int id;
    private String name;

    // public Employee_constructor(){ // Self invoking, Doesn't return any value
    //     id = 1093;
    //     name = "Harsh";
    // }
    // *** Contructor has the same name as the class ***
    
    public Employee_constructor(){ // Passing arguments in a contructor 
        id = 01;
        name = "Great Britain";
    }

    public Employee_constructor(String myName, int myID){ // Contructor overloading
        id = myID;
        name = myName;
    }

    public Employee_constructor(String myName){  // Constructor overloading
        id = 00003;
        name = myName;
    }

    public Employee_constructor(int myID){  // Constructor overloading
        id = myID;
        name = "White Hound";
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setID(int i){
        this.id = i;
    }
}


public class Constructors {
    public static void main(String[] args) {
        // Employee_constructor emp1 = new Employee_constructor("GreyHound", 30975);
        // Employee_constructor emp1 = new Employee_constructor();
        // Employee_constructor emp1 = new Employee_constructor("GreyHound");
        Employee_constructor emp1 = new Employee_constructor(5965);

        // emp1.setID(20912);
        System.out.println("ID --> " + emp1.getID());
        
        // emp1.setName("John");
        System.out.println("Name --> " + emp1.getName());
        
    }
}
