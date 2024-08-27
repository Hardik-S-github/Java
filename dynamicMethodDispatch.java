class Phone{
    public void showTime(){
        System.out.println("The time is 8 am");
    }
    public void on(){
        System.out.println("Phone is on...");
    }
}

class SmartPhone extends Phone{
    public void on(){
        System.out.println("Smart phone is on...");
    }
    public void music(){
        System.out.println("Plying music...");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // obj.name();

        // SmartPhone obj2 = new SmartPhone();
        // obj2.name();

        Phone obj = new SmartPhone(); // A Superclass's reference can refer to a subclass object but not vice versa 
        obj.on();
        obj.showTime();
        // obj.music();

        // Analogy: A smartphone like iPhone 15 plays music but a phone for e.g. Samsung Guru doesn't 
        // So if you tell somebody to pick up the phone and play music, it won't. But if you tell somebody to pick up a smartphone 
        // and play music it will
    }
}
