public class inherit{
    public static void main(String[] args){
	Child c=new Child();
	Parent p = new Parent();
	p.hi();
	c.hi();
    }
}
class Parent{
    private void hi(){
	System.out.println("Hello");
    }
}
class Child extends Parent{

}
