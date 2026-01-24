import java.util.*;
class palindrome 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter number:");
		int number=sc.nextInt();
		int rev=0;
		int temp=number;
		while(number>0){
			rev=(rev*10)+number%10;
			number=number/10;
		}
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
