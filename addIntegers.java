import java.util.*;
class addIntegers
{
	public static int addIntegers(char[]a)
	{
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]>='0' && a[i]<='9')
				sum=sum+(a[i]-48);			
		}
		return sum;
	}
	public static void main(String[]args)
	{
		char[]a={'s','2','4','y','e','4','d'};
		System.out.println(Arrays.toString(a));
		int res=addIntegers(a);
		System.out.println("Total sum of Integers:"+res);
	}
}
