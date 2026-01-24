class  stringToInt//this que asked in relevantz 
{
	public static void main(String[] args) 
	{
		String s="ab12 abc0 34c";
		
		System.out.println(s);
		System.out.println(solve(s));
	}
	public static int solve(String s)
	{
		char[]a=s.toCharArray();
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]>='0' && a[i]<='9')
				sum+=a[i]-48;
		}
		return sum;
	}
}
/*
String s="sy23e4d";
		String ans="";
		for (int i=0;i<s.length() ;i++ )
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
				ans+=ch;
		}
		int number=Integer.parseInt(ans);
		int sum=0;
		while(number>0)
		{
			sum=sum+number%10;
			number=number/10;
		}
		   
			System.out.println(sum);

*/
