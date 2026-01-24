/*import java.util.*;
class sumofn 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++){
		 sum=sum+i;
		}
			System.out.println("Sum of Value:"+sum);
		
	}
}*/
import java.util.*;
class sumofn //reverse program
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter number:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
		System.out.println(i+" ");
		}
		
	}
}

