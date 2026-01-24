class sumofodd 
{
	public static void main(String[] args) 
	{
	   int number=77315;
	   int sum=0;
	   while(number>0)
		{
			int last=number%10;
			if (last%2!=0)
			{
				sum=sum+last;
				number=number/10;
			}
		}System.out.println(sum);
		 
	}
}
