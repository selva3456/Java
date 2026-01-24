import java.util.*;
class array 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter size");
		int size=sc.nextInt();
		int []a=new int[size];
		for (int i=0;i<a.length;i++)
		{
			System.out.print("Enter the value for a:["+i+"]:");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}
}






/*double []b=new double[4];
		String []c=new String[5];
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(c));*/
			