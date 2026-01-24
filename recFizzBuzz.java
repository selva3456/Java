class recFizzBuzz 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		fizzbuzz(1);
		System.out.println("Ends");
	}
	public static void fizzbuzz(int start)
	{
		int end=100;
		for (int i=start;i<=end ;i++ )
		{
			if(i%3==0)
				System.out.println("FIZZ");
			else if(i%5==0)
				System.out.println("BUZZ");
			else if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else
				System.out.println(i);
		}
	}
}
