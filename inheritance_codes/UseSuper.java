
class A3 {
    int i;
}

class B3 extends A3 {
    int i;

    B3() {
    }

    B3(int a, int b) {
        super.i = a;
        i = b;
    }
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
class C3 extends B3 {
        int i;

        C3(int a, int b) {
            super.i = a;
            super.super.i = a;
            i = b;
        }
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

public class UseSuper {

    public static void main(String[] args) {
        B3 bee = new B3(1, 2);

        bee.show();
    }
}