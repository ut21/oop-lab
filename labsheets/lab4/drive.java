class bread{

    public int a =4;

    static void leaveUnattended(){
        System.out.println("mould has formed");
    }
    final void cook(){
        System.out.println("cooking in secret oven on 180 degrees celsius");
    }
    private void knead(){
        System.out.println("adding secret dough and water");
    }
    public void eat(){
        System.out.println("eating the bread");
    }
}
class cake extends bread{
    public int a =5;
    public void eat(){
        System.out.println("eating the cake");
    }
    public void decorate() {
        System.out.println("decorating the cake");
    }
}
class pastry extends cake {
    public int a =6;
    public void eat(){
        System.out.println("eating the pastry");
    }
    public void eatFrosting() {
        System.out.println("eating frosting on pastry");
    }
}
public class drive{
    public static void main(String[] args){
        bread b1 = new bread();
        bread b2 = new cake();
        bread b3 = new pastry();
        cake c1 = new cake();
        cake c2 = new pastry();
        pastry p1 = new pastry();
    //various functions of b1
        System.out.println("b1");
        System.out.println("bread b1 = new bread();");
        b1.leaveUnattended();
        b1.cook();
        //b1.knead();
        b1.eat();
        System.out.println(b1.a);
        //various functions of b2
        System.out.println("b2");
        System.out.println("bread b2 = new cake();");
        b2.leaveUnattended();
        b2.cook();
        b2.eat();
        System.out.println(b2.a);
        //b2.decorate();
        //various functions of b3
        System.out.println("b3");
        b3.leaveUnattended();
        System.out.println("bread b3 = new pastry();");
        b3.cook();
        b3.eat();
        System.out.println(b2.a);
        //b3.decorate();
        //b3.eatFrosting();
        //various functions of c1
        System.out.println("c1");
        System.out.println("bread b3 = new pastry();");
        c1.leaveUnattended();
        c1.cook();
        c1.eat();
        c1.decorate();
        System.out.println(c1.a);
        //various functions of c2
        System.out.println("c2");
        c2.leaveUnattended();
        System.out.println("cake c2 = new pastry();");
        c2.cook();
        c2.eat();
        c2.decorate();
        System.out.println(c2.a);
        //c2.eatFrosting();
        //various functions of p1
        System.out.println("p1");
        p1.leaveUnattended();
        System.out.println("pastry p1 = new pastry();"
        );
        p1.cook();
        p1.eat();
        p1.decorate();
        p1.eatFrosting();
    }
}
