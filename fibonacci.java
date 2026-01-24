import java.util.*;
class fibonacci 
{
	public static void fibo(int n)
	{
		
	int n1=0,n2=1,n3=0;
	for(int i=1;i<=n;i++)
	{
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		n3=n1+n2;
	}
	}
	public static void main(String[]args)
	{
		fibo(10);
	}
}
		
/*import java.util.*;  //ITHU USER TA IRUNTHU VANGURATHU
class fibonacci 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter Number");
		int n=sc.nextInt();
	int n1=0,n2=1,n3=0;
	for(int i=1;i<=n;i++)
	{
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		n3=n1+n2;
	}
	}
}
*/