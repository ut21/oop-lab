package bitsoop.inheritance.interfaces;

public class TestInfImpl implements TestInterface{

    public void compute(int c, int d){
        System.out.println(a);
        System.out.println(TestInterface.ref.b);
    }

    public void compute(){
        System.out.println(a);
        System.out.println(TestInterface.ref.b);
    }
    public static void main (String args[]) {
        new TestInfImpl().compute(6,7);
    }

}
