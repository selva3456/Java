import java.util.*;
class Remote
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String []args)
	{
		System.out.println("1.Power on\n2.Power off\n3.volume up\n4.volume down");
		System.out.print("\t\t\tEnter value:");
		int val=sc.nextInt();
		
		if(val==1)
		{
			System.out.println("Power on");
		}
		else if (val==2)
		{
			System.out.println("Power off");
		}
		else if(val==3)
		{
			System.out.println("Volume up");
			
		}
		else if(val==4)
		{
			System.out.println("Volume Down");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}