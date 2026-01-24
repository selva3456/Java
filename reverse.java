import java.util.*;
class reverseArray
{
	public static int[] reverse(int[]a) 
	{
		int l=0,r=a.length-1;
		while (l<r)
		{
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		return a;
	}
	public static void main(String[]args)
	{
		int[]a={10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(a));
		int []res=reverse(a);
		System.out.println(Arrays.toString(res));
	}
}
