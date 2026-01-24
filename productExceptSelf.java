/*import java.util.*;
class productExceptSelf
{
	public static void main(String[] args) 
	{
		int []a={1,2,3,4};
		int []res=arrayExceptSelf(a);
		System.out.println(Arrays.toString(res));
		
	}
	public static int[] arrayExceptSelf(int []a)
	{
		int[]res=new int[a.length];
		for (int i=0;i<a.length;i++ )
		{
			int ans=1;
			for (int j=0;j<a.length;j++ )
			{
				if(i!=j)
				ans*=a[j];
			}
			res[i]=ans;
		}
		return res;
	}
	
}*/
import java.util.*;
class productExceptSelf
{
	public static void main(String[]args)
	{
		int[]a={1,2,3,4};
		int[]res=productExceptSelf(a);
		System.out.println(Arrays.toString(res));
	}
	public static int[] productExceptSelf(int[]a)
	{
		int n=a.length;
		int[]pre=new int[n];
		int[]suf=new int[n];
		pre[0]=1;
		suf[n-1]=1;
		//it will fill pref array
		for (int i=1;i<n;i++)
		{
			pre[i]=a[i-1]*pre[i-1];
		}
		//it will fill suf array
		for (int i=n-2;i>=0;i--)
		{
			suf[i]=a[i+1]*suf[i+1];
		}
		//product of suf and pre
		int[]res=new int[n];
		for (int i=0;i<n;i++)
		{
			res[i]=pre[i]*suf[i];
		}
		return res;
	}
}

