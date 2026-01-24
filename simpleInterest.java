import java.util.*;
class simpleInterest 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{	
	    System.out.print("\t\t\tEnter principal:");
		double principal=sc.nextDouble();
		System.out.print("\t\t\tEnter rate:");
		double rate=sc.nextDouble();
		System.out.print("\t\t\tEnter time(in years):");
		double time=sc.nextDouble();
		
		double SimpleInterest=(principal*rate*time)/100;
		System.out.print("Simple Interest:"+SimpleInterest);
		
	}
}
