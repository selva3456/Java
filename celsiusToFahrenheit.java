import java.util.*;
class celsiusToFahrenheit 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the celsius:");
		double celsius=sc.nextDouble();
		
		
		double fahrenheit=(celsius*9)/5+32;

		
		System.out.println("Fahrenheit:"+fahrenheit);

	}
}
