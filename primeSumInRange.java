import java.util.*;
class primeSumInRange
{
	static Scanner sc=new Scanner(System.in);
	public static int primeSum(int start,int end)
	{
		int sum=0;
		for (int i=start;i<=end;i++ )
		{
			if(isPrime(i))
				sum=sum+i;
		}
		return sum;
	}
	public static boolean isPrime(int number)
	{
		if(number<=1)//or(number==0 || number==1)
			return false;
		for (int i=2;i<number;i++ )
		{
			if(number%i==0)
			return false;
		}
		return true;
	}
	public static void main(String[]args)
	{
		System.out.print("Start:");
		int start=sc.nextInt();
		System.out.print("End:");
		int end=sc.nextInt();
		System.out.println("Total Sum of Prime:"+primeSum(start,end));
	}
}
