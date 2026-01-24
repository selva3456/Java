class reverseMda 
{
	public static void main(String[] args) 
	{
		int[][]a={
			{10,20,30},
			{40,50,60},
			{70,80,90},
		};
			for (int i=0;i<a.length ;i++ )
			{
				reverseMyArray(a[i]);
				for (int j=0;j<a.length ;j++ )
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
	}
	public static void reverseMyArray(int[]a)
	{
		int l=0,r=a.length-1;
		while (l<r)
		{
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
	}
}
/*this for loop also used for reverse

for (int i=0;i<a.length ;i++ )
			{
			  for (int j=a[i].length-1;j>=0 ;j-- )
			  {
				  System.out.print(a[i][j]+" ");
			  }
			  System.out.println();
			}*/