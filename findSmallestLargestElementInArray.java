import java.util.*;
class findSmallestLargestElementInArray 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{	
		int[]a={8,4,34,38,3,2,6};
		System.out.println(Arrays.toString(a)); 
		int min=a[0];
		int largest=Integer.MIN_VALUE;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			min=a[i];
			
			else if(a[i]>largest)
			largest=a[i];
		}
		System.out.println("Smallest value in the Array is :"+min);
		System.out.println("Largest  value in the Array is :"+largest);
	}
}
