import java.util.*;
class perfectSquare 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter number:");
		int n=sc.nextInt();
		if(isPerfectSquare(n))
			System.out.println("Number is Perfect Square");
		else
			System.out.println("Number is Not Perfect Square");
	}
	 static boolean isPerfectSquare(int n)
	{
	   for (int i=1;i<=n ;i++ )
		{
			if(i*i==n)
			   return true;
		}
		return false;
	}
}
