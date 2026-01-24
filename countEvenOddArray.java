class countEvenOddArray 
{
	public static void main(String[] args) 
	{
		int[]a={2,9,5,4,3,7,12,29,24,88};
		int ecount=0;
		int ocount=0;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]%2==0)
				ecount++;
			else
				ocount++;
		}
		System.out.println("Total Even Count is:"+ecount);
		System.out.println("Total Odd Count is:"+ocount);
	}
}
