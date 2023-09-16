package bitsoop.inheritance;
/*
  To inherit a class, we simply incorporate the definition of
  one class into another by using the extends keyword.
 */
class A {
    int i, j;
    public void showij() {
        System.out.println("i = "+ i + " & j =  " + j);
    }
}
class B extends A {
    int k;
    void showk(){
        System.out.println("k = "+ k);
    }
    int sum() {
        return i+j+k;
    }
}
class InheritanceExample {
    public static void main(String args[]) {
        A superObject = new A();
        B subObject = new B();
        superObject.i = 10;
        superObject.j = 20;
        subObject.i = 30;
        subObject.j = 40;
        subObject.k = 50;
        System.out.println("Super object Contents");
        superObject.showij();
        System.out.println("****************");
        System.out.println("Sub object Contents");
        subObject.showij();
        subObject.showk();
        System.out.println("SUM is " + subObject.sum());
    }
}
/*
1. The subclass B includes all of the members of its superclass, A.
2.  This is why subOb can access i and j and call showij( ).
3. Also, inside sum( ), i and j can be referred to directly,
  as if they were part of B.
4. Even though A is a superclass for B, it is also a completely
   independent, stand-alone class.
   Being a superclass for a subclass does not mean that the
   superclass cannot be used by itself.
5. A subclass can be a superclass for another subclass.
 */