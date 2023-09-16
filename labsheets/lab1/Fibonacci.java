class Fibonacci{
        public static void main(String[] args){
                int n=Integer.parseInt(args[0]);
                int a=1;
                int b=1;
                int temp;
                double sum=0;
                for (int i=0; i<n; i++){
                        System.out.println("The "+i+"th number is: "+a);
			sum+=a;
                        temp=b;
                        b=a+b;
                        a=temp;

}
		System.out.println("avg: "+sum/n);	
}
}
