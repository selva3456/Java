//WAJP to print hello world 4 times without using loop
class recHelloWorld
{
	static int count=1;
	public static void solve(String msg) 
	{
		if(count<=4)
		{
			System.out.println(msg);
			count++;
			solve(msg);
		}
	}
	public static void main(String[]args)
	{
		System.out.println("Start");
		solve("Hello World");
		System.out.println("End");
	}
}
