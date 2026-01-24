import java.util.*;
class rotationofN
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]a={10,20,30,40,50};
		System.out.print("\t\tEnter n:");
		int n=sc.nextInt();
		System.out.println(Arrays.toString(a));
		rotation(a,n);
		System.out.println(Arrays.toString(a));
	}
	public static void rotation(int[]a,int n)
	{
		for (int k=1;k<=n ;k++ )
		{
			int first=a[0];
			for (int i=1;i<a.length ;i++ )
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=first;
		}
	}
}
