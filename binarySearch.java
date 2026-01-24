import java.util.*;
class binarySearch 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]a={10,20,30,40,50,60,70,};
		System.out.println(Arrays.toString(a));
		System.out.print("\t\t\tEnter Element you want:");
		int n=sc.nextInt();
		if(binarySearch(a,n))
			System.out.println("The Element is Found");
		else
			System.out.println("The Element is not Found");
	}
	public static boolean binarySearch(int[]a,int n)
	{
		int l=0,h=a.length-1;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==n)
				return true;
			else if(a[m]>n)
				h=m-1;
			else
				l=m+1;
		}
			return false;
	}
}
