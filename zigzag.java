import java.util.*;
class zigzag
{
	public static void main(String[] args) 
	{
		int[]a={5,4,3,2};
		int[]b={6,7,8,9};
		int[]res=zigzag(a,b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(res));
	}
	public static int[] zigzag(int[]a,int[]b)
	{
		int res[]=new int[a.length+b.length];
		for (int i=0,x=0,y=0;i<res.length;i++)
		{
			if(i%2==0)
				res[i]=a[x++];
			else
				res[i]=b[y++];
		}
		return res;
	}
}
