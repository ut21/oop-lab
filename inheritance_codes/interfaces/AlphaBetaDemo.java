package bitsoop.inheritance.interfaces;

public class AlphaBetaDemo implements Alpha, Beta {


    public static void main(String args[]) {
        AlphaBetaDemo  obj = new AlphaBetaDemo();
        obj.reset();


    }

    @Override
    public void reset() {
        System.out.println("Class Impl. ");
        Beta.compute();
        //Alpha.super.reset();
        Beta.super.reset();

    }
}
