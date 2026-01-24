import java.util.*;
class stringEquals
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t food1:");
		String food1=sc.nextLine();
		System.out.print("\t\t food2:");
		String food2=sc.next();
		System.out.println(food1==food2);// o/p always false because the double equalto not working for string
		                                 // it is only compares address of the string I@20..
		System.out.println(food1.equals(food2));
		
	}
}
