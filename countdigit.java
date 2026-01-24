import java.util.*;
class countdigit 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter number:");
		int num=sc.nextInt();
		int count=0;
		if(num==0)
			count=1;
		else{
			while(num>0){
				num/=10;
				count++;
			}
		}
		System.out.println("Total digits:"+count);
	}
}
