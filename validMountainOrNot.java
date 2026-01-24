class validMountainOrNot 
{
	public static boolean validMountainOrNot(int[]a) 
	{
		int n=a.length;
		if(n<=2)
			return false;
		int peak=0;
		for (int i=0;i<n-1 ;i++ )
		{
			if(a[i]==a[i+1])
				return false;
			if (a[i]>a[i+1])
			{
				peak=i;
				break;
			}
		}
		if(peak==0)
			return false;
		for (int i=peak;i<n-1 ;i++ )
		{
			if(a[i]==a[i+1])
				return false;
			if(a[i]<a[i+1])
				return false;
		}
		return true;
	}
	public static void main(String[]args)
	{
		int[]a={0,2,4,5,3,2,1};
		System.out.println(validMountainOrNot(a));
		
	}
}
