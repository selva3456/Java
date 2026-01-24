class bintodeci 
{
	public static void main(String[] args) 
	{
		int number=1101;
		int sum=0;
		int x=1;
		while(number>0){
			sum=sum+(number%10)*x;
			x=x*2;
			number/=10;
		}
		System.out.println("bin to Deci val:"+sum);
	}
}
