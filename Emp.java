import java.util.Scanner;
class Emp
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String []args)
	{
		System.out.print("\t\t\t\t\tEnter Your E_id:");
		int eid=sc.nextInt();
		
		System.out.print("\t\t\t\t\tEnter Your Salary:");
		long sal=sc.nextLong();
		
		System.out.print("\t\t\t\t\tEnter Your Contact:");
		long ph=sc.nextLong();
		
		System.out.print("\t\t\t\t\tEnter Your Experience:");
		int exp=sc.nextInt();
		
		System.out.print("\t\t\t\t\tEnter Your Gender:");
		char gender=sc.next().charAt(0);
		
	System.out.println("\t\t\t*******************************************");

		System.out.println("\t\t\t\t\t*** EMPLOYEE INFO ***");
		
		System.out.println("E_ID:"+eid);
		System.out.println("SALARY:"+sal);
		System.out.println("PHONE NO:"+ph);
		System.out.println("EXPERIENCE:"+exp);
		System.out.println("GENDER:"+gender);
		
		System.out.print("\t\t\t--------------------------------------------------");
		
		
		
	}
}