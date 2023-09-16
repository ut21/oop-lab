import java.io.*;

class Exercise1{
	public static void main(String args[]) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int sum=0;
		for(int i=0; i<10; i++){
			sum=sum+Integer.parseInt(br.readLine());
}
		System.out.println(sum);
}
}
