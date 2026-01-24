import java.util.*;
class armstrongNumber
{
	static Scanner sc=new Scanner(System.in);
	public static int countDigits(int number)
	{
	  int count=0;
	  while(number>0)
	  {
		number=number/10;
		count++;
	  }
	  return count;
	}
	public static int xpowern(int x,int n)
	{
		int ans=1;
		for (int i=1;i<=n ;i++ )
		{
			ans=ans*x;
		}
		return ans;
	}
	public static void main(String[]args)
	{
		System.out.print("Enter number:");
		int number =sc.nextInt();
		int n=countDigits(number);
		int sum=0;
		for (int i=number;i>0;i/=10)
		{
			int x=i%10;
			sum=sum+xpowern(x,n);
		}
		if(sum==number)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");
	}
}
//153 is arm
//1634