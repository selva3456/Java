class removeDupString 
{
	public static void main(String[] args) 
	{
		String s="Hello World Helicopter";
		String ans="";
		for (int i=0;i<s.length() ;i++ )
		{
			char a=s.charAt(i);
			if(a==' ')
				ans+=" ";
			else if(ans.indexOf(a)==-1)
				ans+=s.charAt(i);
		}
		System.out.println(ans);
	}
}
