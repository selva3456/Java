import java.util.*;
class cyclicPrime
{
	public static void main(String[] args) 
	{
		String s="1197";
		System.out.println(isCyclicPrime(s)?"YES":"NO");
	}
	public static boolean isCyclicPrime(String s)
	{
		for (int i=0;i<s.length() ;i++ )
		{
			int n=Integer.parseInt(s);
			if(!isPrime(n))
				return false;
			s=s.substring(1)+s.charAt(0);
		}
		return true;
	}
	public static boolean isPrime(int n)
	{
		if(n==0 && n==1)
			return false;
		for (int i=2;i<n ;i++ )
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
