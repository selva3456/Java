import java.util.*;
class LeapYear 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter Year:");
		int year=sc.nextInt();
		
	 boolean isLeapYear;
		 
		if ((year%4==0 && year%100!=0) || (year%400==0))
			isLeapYear=true;
		else 
			isLeapYear=false;
		
		if(isLeapYear)
			System.out.println(year+" Is Leap Year");
		else
			System.out.println(year+" Is Not Leap Year");
	}
}
/*
System.out.print("\t\t\tEnter year:");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println(year+"is Leap Year");
		else
			System.out.println(year+"is Not Leap Year");
	 
*/