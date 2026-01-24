import java.util.*;
class Mda1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][]a=new int[3][3];
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print("\t\t\tEnter the Element a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("*************************************");
		//T2BL2R
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*************************************");
		
		//T2BR2L
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=a[i].length-1;j>=0 ;j-- )
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*************************************");
		
		//B2TL2R
		for (int i=a.length-1;i>=0 ;i-- )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*************************************");
		
		//B2TR2L
		for (int i=a.length-1;i>=0 ;i-- )
		{
			for (int j=a[i].length-1;j>=0 ;j-- )
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*************************************");
	}
}
