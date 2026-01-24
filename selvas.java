import java.util.*;
class selvass
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
			case 1->{ double price=0;
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
					price=350;
				}
				case 2->{
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(1500);
					System.out.println("Chicken Biriyani");
				    price=250;
				}
				case 3->{
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(1500);
					System.out.println("Prawn Biriyani");
				    price=250;	
				}
				}
				//quantity section
				System.out.print("\t\t\tEnter the qty:");
				int qty=sc.nextInt();
				double total=price*qty;
				System.out.println("Bill Amount:"+total);
				if(qty>0){
					System.out.println("Order Processing.........");
				}
				else if(qty<=0){
					System.out.println("\t\t\tOrder Cancelled");
					System.out.println("\t\t\t----Thank You-----");
					break;
				}
				//Payment Section
				System.out.println("\t\t\t--Choose Payment Method--\n\t\t\t1.Gpay\n\t\t\t2.Phonepay");
				System.out.print("\t\t\tSelect Your Payment Method:");
				int payment=sc.nextInt();
				if(payment==1){
					System.out.println("\t\t\t***Gpay***");
				}
				else if(payment==2){
					System.out.println("\t\t\t***Phonepay***");
				}
				else{
					System.out.println("\t\t\tInvalid Payment Method");
					break;
				}
				//total bill
				    System.out.println("your Bill Is:"+total);
					System.out.print("Enter Your Bill Amount:");
					double bill=sc.nextDouble();
					if(total==bill){
						System.out.println("\t\t\tWaiting For Otp.... :");
						Thread.sleep(1500);
					}
					else if(total!=bill){
						System.out.println("\t\t\tInvalid Bill Amount");
						break;
					}
				//otp
				
				        System.out.println("Payment processing......");
						Thread.sleep(2000);
						int math=(int)(Math.random()*9999+9999);
						System.out.println(math);
						System.out.print("Enter otp:");
						int otp=sc.nextInt();
					if(math==otp){
						System.out.println("\t\t\tOrder Placed Successfully");
					}
					
					else {
						System.out.println("\t\t\tOrder cancelled");
						System.out.print("\t\t\tThank You");
						break;
					}
					
			}
			    case 2->{double price=0;
				System.out.println("\t\t\t***Welcome To Hotel Of Arabic***");
				System.out.println("\t\t\t--Menu of Arabic--\n\t\t\t1.Schezwan Fried Rice\n\t\t\t2.Chicken Noodels\n\t\t\t3.Crispy Chicken");
				System.out.print("\t\t\tSelect Your Favourite Food:");
				int food1=sc.nextInt();
				switch (food1)
				{
				case 1->{//fr
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(1500);
					System.out.println("Schezwan Fried Rice");
					price=300;
				}
				case 2->{
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(1500);
					System.out.println("Chicken Noodels");
				    price=150;
				}
				case 3->{
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(1500);
					System.out.println("Crispy Chicken");
				    price=250;
					break;
				}
				}
				//quantity section
				System.out.print("\t\t\tEnter the qty:");
				int qty=sc.nextInt();
				double total=price*qty;
				System.out.println("Bill Amount:"+total);
				if(qty>0){
					System.out.println("Order Processing.........");
				}
				else if(qty<=0){
					System.out.println("\t\t\tOrder Cancelled");
					System.out.println("\t\t\t----Thank You-----");
					break;
				}
				//Payment Section
				System.out.println("\t\t\t--Choose Payment Method--\n\t\t\t1.Gpay\n\t\t\t2.Phonepay");
				System.out.print("\t\t\tSelect Your Payment Method:");
				int payment=sc.nextInt();
				if(payment==1){
					System.out.println("\t\t\t***Gpay***");
				}
				else if(payment==2){
					System.out.println("\t\t\t***Phonepay***");
				}
				else{
					System.out.println("\t\t\tInvalid Payment Method");
					break;
				}
				//total bill
				    System.out.println("your Bill Is:"+total);
					System.out.print("Enter Your Bill Amount:");
					double bill=sc.nextDouble();
					if(total==bill){
						System.out.println("\t\t\tWaiting For Otp.... :");
						Thread.sleep(1500);
					}
					else if(total!=bill){
						System.out.println("\t\t\tInvalid Bill Amount");
						break;
					}
				//otp
				        System.out.println("Payment processing......");
						Thread.sleep(2000);
						int math=(int)(Math.random()*9999+9999);
						System.out.println(math);
						System.out.print("Enter otp:");
						int otp=sc.nextInt();
					if(math==otp){
						System.out.println("\t\t\tOrder Placed Successfully");
					}
					else {
						System.out.println("\t\t\tOrder cancelled");
						System.out.print("\t\t\tThank You");
						break;
					}
			        }
					case 3->{double price=0;
				System.out.println("\t\t\t***Welcome To Amman Hotel***");
				System.out.println("\t\t\t--Menu of Amman Hotel--\n\t\t\t1.Idli\n\t\t\t2.Dosa\n\t\t\t3.Pongal");
				System.out.print("\t\t\tSelect Your Favourite Food:");
				int food1=sc.nextInt();
				switch (food1)
				{
				case 1->{//idli
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(1500);
					System.out.println("Idli");
					price=50;
				}
				case 2->{
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(1500);
					System.out.println("Dosa");
				    price=70;
				}
				case 3->{
					System.out.println("\t\t\tProcessing...........");
		            Thread.sleep(1500);
					System.out.println("Pongal");
				    price=100;	
					break;
				}
				}
				//quantity section
				System.out.print("\t\t\tEnter the qty:");
				int qty=sc.nextInt();
				double total=price*qty;
				System.out.println("Bill Amount:"+total);
				if(qty>0){
					System.out.println("Order Processing.........");
				}
				else if(qty<=0){
					System.out.println("\t\t\tOrder Cancelled");
					System.out.println("\t\t\t----Thank You-----");
					break;
				}
				//Payment Section
				System.out.println("\t\t\t--Choose Payment Method--\n\t\t\t1.Gpay\n\t\t\t2.Phonepay");
				System.out.print("\t\t\tSelect Your Payment Method:");
				int payment=sc.nextInt();
				if(payment==1){
					System.out.println("\t\t\t***Gpay***");
				}
				else if(payment==2){
					System.out.println("\t\t\t***Phonepay***");
				}
				else{
					System.out.println("\t\t\tInvalid Payment Method");
					break;
				}
				//total bill
				    System.out.println("your Bill Is:"+total);
					System.out.print("Enter Your Bill Amount:");
					double bill=sc.nextDouble();
					if(total==bill){
						System.out.println("\t\t\tWaiting For Otp.... :");
						Thread.sleep(1500);
					}
					else if(total!=bill){
						System.out.println("\t\t\tInvalid Bill Amount");
						break;
					}
				//otp
				        System.out.println("Payment processing......");
						Thread.sleep(2000);
						int math=(int)(Math.random()*9999+9999);
						System.out.println(math);
						System.out.print("Enter otp:");
						int otp=sc.nextInt();
					if(math==otp){
						System.out.println("\t\t\tOrder Placed Successfully");
					}
					else {
						System.out.println("\t\t\tOrder cancelled");
						System.out.print("\t\t\tThank You");
						break;
					}
						
					}
					
		}
		
				
			    }
			}
	
