import java.util.*;
class printDupElement 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{	
		int[]a={8,2,5,18,23,12,4,23,8,19,8,7};
		System.out.println(Arrays.toString(a));
		checkDup(a);
		
	}
	public static void checkDup(int[]a)
	{
		for (int i=0;i<a.length;i++ )
		{
			int count=0;
			if(a[i]==Integer.MIN_VALUE)
				continue;
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=Integer.MIN_VALUE;
				}
			}	
			if (count>0)
				System.out.println(a[i]+":"+count);
		}
	}
}
