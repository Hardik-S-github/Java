class A{
    public int hardik(){
        return 4;
    }

    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override // Annotates that meth2 is overriding
    public void meth2(){ // method overriding of meth2() of A
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
        b.meth3();

    }
}
