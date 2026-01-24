import java.util.*;
class pronicNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter number:");
		int num=sc.nextInt();
		if(isPronic(num))
			System.out.println("It is pronic number");
		else
			System.out.println("not pronic number");
	}
	public static boolean isPronic(int num)
	{
		for (int i=1;i<num ;i++ )
		{
			if(i*(i+1)==num)
				return true;
		}
		return false;
	}
}
