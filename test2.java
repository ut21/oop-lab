public class test2 {
public static void main(String[] args) {
int i = 25;
System.out.println(i);
iMethod(i);
System.out.println(i);
i = iMethod(i);
System.out.println(i); 
}
public static int iMethod(int iTest) {
iTest = 9; // change it
System.out.println(iTest);
return iTest;
}
}
