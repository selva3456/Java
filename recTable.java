import java.util.*;
class recTable
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Start");
		System.out.print("Enter number");
		int number=sc.nextInt();
		table(number,1);
		System.out.println("Ends");
		
	}
	public static void table(int number,int x)
	{
		if(x<=10)
		{
			System.out.println(x+"*"+number+"="+(x*number));
			x++;
			table(number,x);
		}
	}
}
