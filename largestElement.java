class largestElement 
{
	public static int findLargest(int[]a)
	{
		int largest=Integer.MIN_VALUE;//Integer.MIN_VALUE naa -infinite (or) negative value
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]>largest)
				largest=a[i];
		}
		return largest;
	}
	public static void main(String[] args) 
	{
		int[]a={8,4,34,87,9,67,12};
		System.out.println(findLargest(a));
	}
}
