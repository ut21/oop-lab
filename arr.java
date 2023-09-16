import java.util.Scanner;
public class arr{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int count = scan.nextInt();
	int[] a=new int[count];
	for(int i=0; i<count; i++){
		a[i]=i;
	}
	for(int i : a){
	    System.out.println(i);
	}
    }
}
