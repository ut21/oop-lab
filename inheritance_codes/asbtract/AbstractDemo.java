package bitsoop.inheritance.asbtract;

abstract class A8 {
    private int k ;
    public static int z = 67;
    private final int y = 76;
    public static final int l = 90;


    abstract void callme();

    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class B8 extends A8 {
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}

class C8 extends  A8{
    void callme() {
        System.out.println("C's implementation of callme.");
    }
}
class AbstractDemo {

    public static void main(String[] args) {
        B8 b = new B8();

        b.callme();
        b.callmetoo();
    }
}
