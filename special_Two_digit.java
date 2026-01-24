import java.util.*;
class special_Two_digit 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter Number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
	    int mul=1;
		while(num>0)
		{
			sum=sum+num%10;
			mul=mul*(num%10);
			num=num/10;
		}
		int add=sum+mul;
		System.out.println(add);
		if(add==temp)
			System.out.println("The given number is special to digit");
		else
			System.out.println("The given number is not special to digit");
		
	}
}
