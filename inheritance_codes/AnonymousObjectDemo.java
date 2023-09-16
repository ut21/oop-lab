package bitsoop.inheritance;

public class AnonymousObjectDemo
{
    // Declare instance variable.
    int a;

    // Declaration of one parameter constructor.
    AnonymousObjectDemo(int p)
    {
        a = p;
    }
    // Declaration of instance methods.
    void area()
    {
        int area = a * a;
        System.out.println("Area of square: " +area);
    }
    void perimeter(int b)
    {
        int peri = 4 * b;
        System.out.println("Perimeter of square: " +peri);
    }
    public static void main(String[] args)
    {
// Create anonymous object.
        new AnonymousObjectDemo(50).area();
        new AnonymousObjectDemo(10).perimeter(100);
        new AnonymousObjectDemo(20).area();
        new AnonymousObjectDemo(30).perimeter(200);
    }
}

/*
1. An object which has no reference variable is called anonymous object in Java.
2. Anonymous means nameless.
3. Java anonymous object creation is useful when it is not used more than once.
 */