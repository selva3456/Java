class recEvenNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		evenNumber(1);
		System.out.println("End");
	}
	public static void evenNumber(int start)
	{
		int end=100;
		for (int i=start;i<=end ;i++ )
		{
			if (i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
