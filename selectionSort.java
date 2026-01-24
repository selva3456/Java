import java.util.*;
class selectionSort
{
	public static void main(String[] args) 
	{
	    int []a={8,3,4,17,-23,37,-7,0,9,-12};
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length-1;i++)
		{
			int sam=i;
			for (int j=i+1;j<a.length;j++)
			{
				if (a[j]<a[sam])
			      sam=j;
			}
			//Exited inner for loop
		int temp=a[i];
		a[i]=a[sam];
		a[sam]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	
}
