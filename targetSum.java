import java.util.*;
class targetSum
{
	public static void targetSum(int[]a,int target)
	{
		Arrays.sort(a);
		int l=0,r=a.length-1;
		while(l<r)
		{
			if(a[l]+a[r]==target)
				System.out.println(a[l]+","+a[r]);
			if(a[l]+a[r]>target)             //ipa target 10 nu keta second if eluthama l++,r++ matum potukalam
	    	   r--;
			else
			   l++;
		}
		
	}
	public static void main(String[] args) 
	{
		int[]a={8,5,9,3,1,2,6,4};
		targetSum(a,10);
	}
}