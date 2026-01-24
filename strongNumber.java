/*import java.util.*;
class strongNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main (String[]args)
	{
		int num=1465,temp=num,sum=0;
		
		while (num>0)
		{
			int num1=num%10;
			
			int fact=1;
			while (num1>0)
			{
				fact*=num1;
				num1--;
			}
			num/=10;
			sum+=fact;
		}
		if (sum==temp)
		{
			System.out.println("Strong Number");
			
		}
		else
			System.out.println("not Strong Number");			
	}
	
}*/
import java.util.*;
class strongNumber
{
	static Scanner sc=new Scanner(System.in);
	public static int factorial(int number)
	{
		int ans=1;
		for (int i=number;i>=2;i--)
		{
			ans*=i;
		}
			return ans;
	}
	public static void main(String[]args)
	{
		System.out.print("Enter number:");
		int number=sc.nextInt();

		int sum=0;
		for (int i=number;i>0 ;i/=10)
		{
			int digit=i%10;
			sum+=factorial(digit);
		}
	
	if (sum==number)
	{
		System.out.println("Strong number");
	}
	else
		System.out.println("not strong number");
	}
}//strong numbers are 145,40585

