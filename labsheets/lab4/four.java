class A{
    // public int num = 70;
    public void check_again(){
        System.out.println(num);
    }
    private void check(){
        System.out.println("Method of A");
    }
    public void speak(){
        System.out.println("A, this is a small message hatera de nal");
    }
}

class B extends A{
    public void speak(){
        System.out.println("B, this is a small message hatera de nal");
    }
}

class C extends A{
    public void speak(){
        System.out.println("C, this is a small message hatera de nal");
    }
}

class D extends A{
    public int num = 69;
    public void check_again(){
        System.out.println(num);
    }
    public void check(){
        System.out.println("Method of D");
    }
    
    public void speak(){
        System.out.println("D, this is a small message hatera de nal");
    }
}

class E extends C{
    public void speak(){
        System.out.println("e, this is a small message hatera de nal");
    }
}

public class four{
    public static void main(String[] args){
        D one = new D();
        int a = one.num;
        System.out.println(a);
        one.check();
        one.check_again();  
        D two = new A();
        A three = new C();
        E four = new C();

        one.speak();
        //two.speak();
        three.speak();
        //four.speak();
    }
}

//<Reference_type> name = new <Object_type>(); The reference type determines access to members and methods, and the object type determines the value of those members/methods











