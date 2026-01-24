import java.util.*;
class bubbleSort
{
	public static void main(String[] args) 
	{
		int[]a={-13,0,5,-7,98,56,3,16,-21};
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length-1;i++)
		{
			for (int j=0;j<a.length-1;j++ )
			{
				if (a[j]>a[j+1])
			    //swap
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
