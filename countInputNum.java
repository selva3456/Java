import java.util.*;
class countInputNum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]arr={1,4,9,4,13,15,2,8,2,34,25,19,2,4};
		System.out.print("\t\t\tEnter Number to Find:");
		int ele=sc.nextInt();
		int count=count(arr,ele);
		System.out.println(ele+" is present "+count+" times");
	}
	public static int count(int[]arr,int ele)
	{
		int count=0;
		for (int i=0;i<arr.length ;i++ )
		{
			if(arr[i]==ele)
				count++;
		}
		return count;
	}
}
