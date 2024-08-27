class simple{
    int A;

    simple(int v){
        this.A = v; // "this" is a reference, refers to the instance variable "A"
    }

    // simple(){
    //     System.out.println("I am contructor of simple");
    // }

    public int getA() {
        return A;
    }
}

class simple2 extends simple{
    simple2(int c){
        super(c);
        System.out.println("I am a constructor of simmple2");
    }
}

public class keywords_super_this {
    public static void main(String[] args) {
        simple e = new simple(10);
        simple2 f = new simple2(20);
        System.out.println(e.getA());
    }
}
