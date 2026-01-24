import java.util.*;
class selvak
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
		System.out.println("\t\t\t1.Buhari\n\t\t\t2.Hotel of Arabic\n\t\t\t3.Amman Hotel");
		System.out.print("\t\t\tSelect Your Favourite Hotel:");
		int hotel=sc.nextInt();
		System.out.println("\t\t\tProcessing...........");
		Thread.sleep(3000);
		switch(hotel){
			case 1->{//buhari
				System.out.println("\t\t\t***Welcome To Buhari***");
				System.out.println("\t\t\t--Menu of Buhari--\n\t\t\t1.Mutton Biriyani\n\t\t\t2.Chicken Biriyani\n\t\t\t3.Prawn Biriyani");
				System.out.print("\t\t\tSelect Your Favourite Food:");
				int food1=sc.nextInt();
				switch (food1)
				{
				case 1->{//mb
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(1500);
					System.out.println("Mutton Biriyani");
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(3000);
					int a=350;
					int b=0;
					System.out.println("Price of Mutton Biriyani:"+a);
					System.out.print("\t\t\tSelect The Quantity:");
					int qty=sc.nextInt();
					double bill=qty*a;
					System.out.println("Total Amount Of Mutton Biriyani:"+bill);
					if(qty>0){
						System.out.println("Ordered Successfully");
					}
					else if(qty==0 || qty<0 ){
						
						System.out.println("Order Cancelled");
						System.out.println("Thank You");
						break;
					}
					Thread.sleep(2000);
					System.out.println("\t\t\t---Payment Methods Are:---\n\t\t\t\t1.GPay\n\t\t\t\t2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay=sc.nextInt();
					switch (pay)
					{
						case 1->{
							System.out.println("\t\t\t**GPay**");
						}
						case 2->{
							System.out.println("\t\t\t**PhonePay**");
						}
						default ->{
							System.out.println("\t\t\tThere Is No Payment Option");
							break;
						}
					}
					System.out.println("your Bill Is:"+bill);
					System.out.print("Enter Your Bill Amount:");
					double billa=sc.nextDouble();
					if(billa==bill){
						int math=(int)(Math.random()*9999+9999);
						System.out.println(math);
						System.out.print("Enter otp:");
						int otp=sc.nextInt();
					if(math==otp){
						System.out.println("\t\t\tOrder Placed Successfully");
					}
					
					else {
						System.out.print("order cancel");
					}
						
					}
					else{
						System.out.println("Entered Amount Is Wrong");
					}
					
				}
				case 2->{//cb
					System.out.println("\t\t\tProcessing...........");
					Thread.sleep(1500);
					System.out.println("Chicken Biriyani");
					System.out.println("\t\t\tProcessing...........");
					Thread.sleep(1500);
					int a=250;
					System.out.println("Price Of Chicken Biriyani:"+a);
					Thread.sleep(1000);
					System.out.print("\t\t\tQuantity of Chicken Biriyani:");
					int qty=sc.nextInt();
					double 
					if(qty>0){
						System.out.println("\t\t\tOrdered Successfully");
					}
					else if(qty<=0){
						System.out.println("\t\t\tOrder Cancelled");
						System.out.println("\t\t\tThank You");
						break;
					}
					System.out.println("\t\t\t---Choose Payment Option:---\n\t\t\t1.GPay\n\t\t\t2.PhonePay");
					System.out.print("\t\t\tChoose Your Payment Method:");
					int pay=sc.nextInt();
					switch (pay)
					{
					case 1->{
						System.out.println("\t\t\t**GPay**");
					}	
					case 2->{
						System.out.println("\t\t\t**PhonePay**");
					}
					default ->{
						System.out.println("\t\t\t**Invalid Payment Method**");
						break;
					}
					}
					System.out.print("\t\t\tYour Bill Is:");
					System.out.print("Enter Your Bill Amount:"
					int bill
					
					
					
					
				}
				case 3->{//pb
					System.out.println("Prawn Biriyan");
					
				}
				
				}
			}
			case 2->{//arabic
				
			}
			case 3->{//amman
				
			}
		}
		
	}
}