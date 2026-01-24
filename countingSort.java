import java.util.*;
class countingSort
{
	public static void main(String[] args) 
	{
		int[]a={7,3,4,1,7,6,3,2,1,8,4,1};
		System.out.println(Arrays.toString(a));
		int largest=Integer.MIN_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]>largest)
				largest=a[i];
		}
		int[]res=new int[largest+1];
		for (int i=0;i<a.length ;i++ )
		{
			res[a[i]]++;
		}
		for (int i=0,x=0;i<res.length ;i++ )
		{
			while (res[i]>0)
			{
				a[x]=i;
				res[i]--;
				x++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
