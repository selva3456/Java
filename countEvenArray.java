class countEvenArray
{
	public static void main(String[] args) 
	{
		int[]a={2,1,3,5,7,4,6,9,8,10};
		int count=0;
		for (int i=0;i<a.length;i++)
		{
	       if(a[i]%2==0)
			
			   count++;	  
		}
		System.out.println(count);
		
	}
}
