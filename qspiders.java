import java.util.*;
class qspiders
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) throws Exception
	{
		System.out.println("\t\t\t\t1.SQL\n\t\t\t\t2.JAVA");
		System.out.print("\t\t\tEnter your Subject:");
		int sub=sc.nextInt();
		switch (sub)
		{
		case 1->{
			System.out.println("SQL");
		   System.out.println("\t\t\t ---SQL Trainers Are:----");
		   Thread.sleep(200);
		   System.out.println("\t\t\t\t1.Nagaraj\n\t\t\t\t2.Vinod");
		   System.out.print("\t\t\tSelect Your Trainer Name:");
		   int trainer=sc.nextInt();
		   switch(trainer)
	       {
			case 1->{
				System.out.println("SQL By NAGARAJ");
			}
			case 2->{
				System.out.println("SQL By VINOD");
			}
			default ->{
				System.out.println("There Is No Trainer Available");
			}
			
		   }
		}
		case 2->{
			System.out.println("JAVA");
			System.out.println("\t\t\tJAVA Trainers Are:");
			Thread.sleep(500);
			System.out.println("\t\t\t\t1.Tabrez\n\t\t\t\t2.Pranav");
			System.out.print("\t\t\tSelect Your Trainer Name:");
			int trainers=sc.nextInt();
			switch(trainers)
			{
			case 1->{
				System.out.println("JAVA By TABREZ");
			}
			case 2->{
				System.out.println("JAVA By PRANAV");
			}
			default->{
				System.out.println("There Is No Trainer Available");
				
			}
			}
			
		}
		default ->{
			System.out.println("Invalid");
		}
		
		}
		
		
	}
}