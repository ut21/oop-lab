package bitsoop.inheritance.interfaces;

public interface TestInterface {
    //private int a = 5;
    public int a = 5;
    Random ref = null;
    interface NestedIF {
        boolean isNotNegative(int x);
    }
    //private void compute();
    void compute(int a, int b);
    private void doCompute() {
        System.out.println("Hello Java");
    }
}

interface Random {
    int b = 6;
}