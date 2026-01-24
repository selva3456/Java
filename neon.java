class neon 
{
	public static void main(String[] args) 
	{
		int num=9;//neon numbers are 0,1,9
		int sum=0;
		int digit=0;
		int total=0;
		
			sum=num*num;
		while(sum>0)
		{
			digit=sum%10;
			total=total+digit;
			sum=sum/10;
		}
		if(num==total)	
		   System.out.println("Neon");
		else
		   System.out.println("Not a Neon");	
	}
}
//neon means num=9 ->9*9=81 then total=8+1=9 ->if num==total it is known as neon