public class string{
	public static void main(String args[]){
		String s1="hello123456789123456789";
		String s2=new String("hello");
		String s3="hello123456789123456789";
		boolean b = (s1==s2);
		boolean c = (s1==s3);
		s3="bye";
		String s4 = new String(s3);
		System.out.println(s4); 
		String s5 = new String("bye");
		s3="bello";
		System.out.println(s4);
		System.out.println(s3);
		System.out.println(s2 + " " + s1);
		System.out.println(s4==s5);
	}
}
