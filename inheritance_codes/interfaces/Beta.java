package bitsoop.inheritance.interfaces;

public interface Beta extends Alpha {
    default public void reset() {
        System.out.println("Beta Interface");

    }
    static void compute() {
        System.out.println("Hello Static");
    }
}
