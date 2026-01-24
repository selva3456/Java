import java.util.*;
class table {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        do {
            System.out.print("\t\t\t1.Tables\n\t\t\t2.A-Z\n\t\t\t3.Calculator\n\t\t\t4.Exit");
            System.out.print("\n\t\t\tEnter number:");
            int number = sc.nextInt();

            switch (number) {
                case 1 -> {
                    System.out.print("\t\t\tEnter Table:");
                    int table = sc.nextInt();
                    int count = 1;

                    while (count <= 10) {
                        int sum = count * table;
                        System.out.println(count +"x"+ table+ "="+ sum); 
                        count++;
                    }
                }
				case 2->{
					char ch='A';
					while(ch<='Z'){
						System.out.println(ch+"");
					    ch++;
					}
				}
				case 3->{
					System.out.println("\t\t**Calculator**");
					System.out.print("Enter First Number:");
					int firstnum=sc.nextInt();
					System.out.print("Operators-->(+,-,*,/):");
					char op=sc.next().charAt(0);
					System.out.print("Enter Second Number:");
					int secondnum=sc.nextInt();
					switch(op)
						{
						case '+'->{
							int sum=firstnum+secondnum;
							System.out.println(firstnum+"+"+secondnum+"="+sum);
						}case '-'->{
							int sum1=firstnum-secondnum;
							System.out.println(firstnum+"-"+secondnum+"="+sum1);
						}case '*'->{
							int sum2=firstnum*secondnum;
							System.out.println(firstnum+"x"+secondnum+"="+sum2);
						}case '/'->{
							int sum3=firstnum/secondnum;
							System.out.println(firstnum+"/"+secondnum+"="+sum3);
						}
						default ->{
							System.out.println("Invalid");
						}
					}
					
				}case 4->{
						flag=false;
					}
            }
			
        } while (flag);
		   System.out.println("Nandri");
    }
}
