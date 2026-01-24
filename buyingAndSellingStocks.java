class buyingAndSellingStocks 
{
	public static void main(String[] args) 
	{
		int[]a={7,1,5,3,6,4};
		System.out.println(max_profit(a));
	}
	public static int max_profit(int[]a)
	{
		int bp=a[0],max_profit=0,n=a.length;
		for (int i=1;i<n ;i++ )
		{
			int profit=a[i]-bp;
			max_profit=Math.max(profit,max_profit);
			if (a[i]<bp)
		       bp=a[i];
		}
		return max_profit;
	}
}
