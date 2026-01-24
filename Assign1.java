class Assign1 
{
	public static void main(String[] args) 
	{
		int x=8,y=3;
		int z=(x++ + ++y)+(y++ + x++);
		int w=(++z + y)+(x++ + z++);
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
		System.out.println("w:"+w);
		
	
			int p=10,q=4;
			int r=(--p + q++)+(p++ + ++q);
			int s=(r-- + p++)+(++q + r++);
			System.out.println("p:"+p);
		    System.out.println("q:"+q);
		    System.out.println("r:"+r);
		    System.out.println("s:"+s);
		
	}
}
