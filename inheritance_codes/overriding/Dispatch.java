// package bitsoop.inheritance.overriding;

class A7 {
    int i =6;
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B7 extends A7 {
    int i = 7;
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C7 extends B7 {
    int i = 8;
    int k = 10;
    void callme() {
        System.out.println("Inside C's callme method" + k);
        System.out.println(i);
    }
}

public class Dispatch {

    public static void main(String[] args) {
        A7 a = new A7();
        B7 b = new B7();
        C7 c = new C7();

        A7 r;

        r = a;
        r.callme();
        System.out.println(r.i);

        r = b;
        r.callme();
        System.out.println(r.i);

        r = c;
        r.callme();
        System.out.println(r.i);
    }
}