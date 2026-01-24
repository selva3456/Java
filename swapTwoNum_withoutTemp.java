import java.util.*;
class swapTwoNum_withoutTemp 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//System.out.print("\t\t\tEnter num for A:");
	//	int a=sc.nextInt();
	//	System.out.print("\t\t\tEnter num for B:");
	//	int b=sc.nextInt();
	int a=10,b=20;
		System.out.println("\t\t\tBefore Swap => a="+a+"  b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\t\t\tAfter Swap => a="+a+"  b="+b);
	}
}
