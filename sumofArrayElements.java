import java.util.Arrays;
class sumofArrayElements
{
	public static int sumofArrayElements(int[]a) 
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String[]args)
	{
		int[]a={5,4,8,1,3,7};
		System.out.println(Arrays.toString(a));//intha string values output la varanum na matum tha 
		                                       //ilana use panamakuda vidalam
		int res=sumofArrayElements(a);
		System.out.println("Total Sum:"+res);
	}
}
