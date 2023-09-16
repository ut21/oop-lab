package bitsoop.inheritance.interfaces;

public class InterfaceReference {

    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
        // Cannot Access nonIfaceMeth()
        //c.nonIfaceMeth();
    }
}
