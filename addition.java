class addition 
{
	public static void main(String[] args) 
	{
		double iwallet=10000;
		System.out.println("initial wallet amount:"+iwallet);
		double mwallet=3000;
		System.out.println("add morning amount:"+mwallet);
		System.out.println("balance morning:"+(mwallet+iwallet));
		double awallet=5000;
		System.out.println("add afternoon amount:"+awallet);
		System.out.println("balance afternoon:"+(awallet+mwallet+iwallet));
		double ewallet=7000;
		System.out.println("add evening amount:"+ewallet);
		System.out.println("TOTAL BALANCE:"+(ewallet+awallet+mwallet+iwallet));
		
		
		
	}
}
