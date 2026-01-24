class recAtoZ 
{
	public static void main(String[] args) 
	{ 
		System.out.println("Start");
		atoz('A');
		System.out.println("End");
	}
	public static void atoz(char ch)
	{
		if(ch<='Z')
		{
			System.out.println(ch+" ");
			ch++;
			atoz(ch);
		}	
	}
}
