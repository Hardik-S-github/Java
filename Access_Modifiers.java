class Myemp{
    private int id;
    private String name;

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void setID(int i){
        id = i;
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        Myemp emp1 = new Myemp();
        // emp1.id = 234;
        // emp1.name = "Jack";  --> This will show an error as the entities of the class **Myemp** are private  
    }

}
