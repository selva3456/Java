import java.util.*;
class greatestofthree
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) 
	{
		System.out.print("\t\t\tEnter A:");
		int a=sc.nextInt();
		
		System.out.print("\t\t\tEnter B:");
		int b=sc.nextInt();
		
		System.out.print("\t\t\tEnter C:");
		int c=sc.nextInt();
		
		int max=(a>b)? (a>c ? a:c) : (c>a ? c:a);
		String res=(a>b)? (a>c)? "a":"c" :(c>a)? "c":"a";
		System.out.println(max);
		System.out.println(res);
		
	}
}
/*
import java.util.*;
class greatestofthree
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) 
	{
		System.out.print("\t\t\tEnter A:");
		int a=sc.nextInt();
		System.out.print("\t\t\tEnter B:");
		int b=sc.nextInt();
		System.out.print("\t\t\tEnter C:");
		int c=sc.nextInt();
		int res=greatestofthree(a,b,c);
		System.out.println("Greatest of Three Is:"+res);
	}
	public static int greatestofthree(int a,int b,int c)
	{
		if(a>b && a>c)
			return a;
		else if (b>c)
		    return b;
		else
			return c;
	}
}*/	
/*
int a=10,b=50,c=30;
		int res=(a>b)?(a>c?a:c):((b>c)?b:c);
		System.out.println(res);
		/*
		if(a>b && a>c)
		System.out.println("a:"+a);
		else if(b>c)
		System.out.println("b:"+b);
		else
			System.out.println("c:"+c);*/
*/