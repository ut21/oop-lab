public class test {
public static void main(String[] args) {
StringBuffer sb = new StringBuffer("Hello, world");
System.out.println(sb);
sbMethod(sb);
System.out.println(sb);
}
public static void sbMethod(StringBuffer sbTest) {
sbTest = sbTest.insert(7, "Java ");
System.out.println(sbTest);
}
}
