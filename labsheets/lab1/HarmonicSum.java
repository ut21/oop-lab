class HarmonicSum{
	public static void main(String[] args){
		double n=50000;
		double sum_f=0;
		double sum_b=0;
		for(double i=1; i<=n; i++){
			sum_f=sum_f+1/i;
}
		for(double i=n; i>0; i--){
			sum_b=sum_b+1/i;
}
		System.out.println(sum_f);
		System.out.println(sum_b);
}
}
