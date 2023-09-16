package bitsoop.inheritance.interfaces;

class A {
    interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

/*class C implements TestInterface.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}*/

class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        //TestInterface.NestedIF nif2 = new C();
        if (nif.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }

        if (nif.isNotNegative(-12)) {
            System.out.println("this won't be displayed");
        }
        else {
            System.out.println("NEGATIVE VALUE");
        }
    }
}