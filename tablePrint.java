import java.util.*;
class tablePrint 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Starting Table:");
		int start=sc.nextInt();
		System.out.print("Enter Ending Table:");
		int end=sc.nextInt();
		printTable(start,end);
		
	}
	public static void printTable(int start,int end)
	{
		for (int j=start;j<=end;j++)
		{
			for  (int i=1;i<=10;i++)
			{
				System.out.println(j+"x"+i+"="+(i*j)+"\t");
				
			}
			System.out.println();
		}
		
	}
}
