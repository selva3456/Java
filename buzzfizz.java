import java.util.*;
class buzzfizz
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("\t\t\tEnter number:");
		int val=sc.nextInt();
		
		if (val%3==0 && val%5==0)
		{
			System.out.println("BuzzFizz");
		}
		else if (val%5==0)
		{
			System.out.println("Fizz");
		}
		else if (val%3==0)
		{
			System.out.println("Buzz");
		}
		else 
		{
			System.out.println("Not Divisible by 3 & 5");
		}
		
	}
}