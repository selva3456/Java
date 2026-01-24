import java.util.*;
class mergeSortedArray 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{	
		int[]a={10,40,50,70};
		int[]b={20,30,60,80};
		int[]res=merge(a,b);
	   System.out.println(Arrays.toString(res));
		
	}
	public static int[] merge(int[]a,int[]b)
	{
		int[]res=new int[a.length+b.length];
		int l=0,r=0,i=0;
		while(l<a.length && r<b.length)
		{
			if(a[l]<b[r])
			   res[i++]=a[l++];
			else
				res[i++]=b[r++];
		}
		while(l<a.length)
		{
			res[i++]=a[l++];
		}
		while(r<b.length)
		{
				res[i++]=b[r++];
		}
		return res;
	}
}
