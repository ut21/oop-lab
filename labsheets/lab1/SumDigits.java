class SumDigits{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int sum=0;
		int count=0;
		while(n!=0){
			int a=n%10;
			sum+=a;
			n=n/10;
			System.out.printf(a+" + ");
}
		System.out.println("="+sum);
}
}
