package bitsoop.inheritance.interfaces;

interface A2 {
    void meth1();

    void meth2();
    //void meth3(); //What will happen if we uncomment this line?
}

interface B2 extends A2 {
    void meth3();
}

class MyClass implements B2 {
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    public void meth2() {
        System.out.println("Implement meth2().");
    }

    public void meth3() {
        System.out.println("Implement meth3().");
    }
}

public class IFExtend {

    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
