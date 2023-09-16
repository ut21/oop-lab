package bitsoop.inheritance.interfaces;

public interface Alpha {
    default public void reset(){
        System.out.println("Alpha Interface");
    }
}
