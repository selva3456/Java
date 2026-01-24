import java.util.Arrays;
class sumofEvenElements
{
	public static int sumofEvenElements(int[]a) 
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
			
		}
		return sum;
	}
	public static void main(String[]args)
	{
		int[]a={5,4,8,1,2,6,3};
		System.out.println(Arrays.toString(a));
		int res=sumofEvenElements(a);
		System.out.println("Total Sum:"+res);
	}
}