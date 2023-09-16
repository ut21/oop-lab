package bitsoop.inheritance;
/*
1. This program will not compile because the use of j
inside the sum( ) method of B causes an access violation.
2. Since j is declared as private, it is only accessible
by other members of its own class.
3. Subclasses have no access to it.
 */
class X {
    int i;
    private int j;

    void setIJ(int t, int j){
        this.i = t;
        this.j = j;
    }

    public int getJ() {
        return j;
    }
}
class Y extends X {
    int total;
    void sum() {
        //total = i + j;
        System.out.println(i);
        System.out.println(getJ());
        total = i + getJ();
    }
}
public class PrivateInheritance {
    public static void main (String args[]) {
        X xSuperObject = new X();
        Y ySubObject = new Y();
        xSuperObject.setIJ(10,20);
        ySubObject.sum();
        System.out.println(ySubObject.total);
    }

}
