package bitsoop.inheritance.overriding;

class A5 {
    private int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B5 extends A5 {
    private int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
        //return 0;
    }
}

class C5 extends B5 {
    private int z;

    C5(int a, int b, int c, int d) {
        super(a, b,c);
        z = d;
    }


}

public class Override {

    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);
        C5 subOb1 = new C5(1, 2, 3,4);

        subOb.show();
        subOb1.show();
    }
}
