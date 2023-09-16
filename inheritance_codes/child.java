class parent{
    private int a = 69;
    public int pub = 13;
    final void meth(){
        System.out.println("final method");
    }
}

class childd extends parent{
    public int b = 420;
    // public int test = super.a;
    public int test2 = super.pub;
    void meth(int i){
        System.out.println("illegal"+i);
    }
}

public class child{
    public static void main(String[] args){
        childd c = new childd();
        System.out.println(c.b);
        System.out.println(c.test2);
        c.meth();
        // System.out.println(c.super.pub);
        // System.out.println(c.super.a);

    }
}
