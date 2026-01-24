class test
{
	public static void main(String[]args) throws Exception
	{
	String s="-----------------Hello Selva---------------------";
	for(int i=0;i<s.length();i++)
	{
		System.out.print(s.charAt(i));
		Thread.sleep(100);
	}
	}
}