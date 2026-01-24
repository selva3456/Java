import java.util.*;
class recFibonacci
{
	static Scanner sc=new Scanner(System.in);
	static int series;
	public static void main(String[] args) 
	{
		System.out.println("Start");
		System.out.print("Enter series:");
		series =sc.nextInt();
		fibo(0,1,0);
		System.out.println("Ends");
	}
	public static void fibo(int n1,int n2,int n3)
	{
		if(series>=1)
		{
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
			n3=n1+n2;
			series--;
			fibo(n1,n2,n3);
		}
	}
}
