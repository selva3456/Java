import java.util.*;
class secondLargestElementArray
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{	
		int[]a={8,4,34,38,3,2,6};
		System.out.println(Arrays.toString(a));
		System.out.println(secondLargest(a));
	}
	public static int secondLargest(int[]a)
	{
		int n=a.length;
		Arrays.sort(a);
		for (int x=0,i=n-2;i>=0;i--)
		{
			if(a[i]!=a[n-1]){
			return a[i];
			}
		}
		return -1;
	}
}
