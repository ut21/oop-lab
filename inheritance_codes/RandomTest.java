package bitsoop.inheritance;

class T1 {
    int i ;
    int j;
    T1 (int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class T2 extends T1 {

    T2 () {
        super (0,0);
    }
}
public class RandomTest {

}
