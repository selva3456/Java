import java.util.*;
class stringNum 
{
	public static void main(String[] args) 
	{
		String s="sy23e4d";//432
		String res="";
		for (int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
				res+=s.charAt(i);
		}
		solve(res);
	}
	public static void solve(String s)
	{
		String res="";
		for (int i=s.length()-1;i>=0;i--)
		{
				res+=s.charAt(i);
		}
		System.out.println(res);
	}
}
/*
THIS IS ONLY ENOUGH FOR THIS O/P=>432
public static void main(String[] args) 
	{
		String s="sy23e4d";
		String res="";
		for (int i=s.length()-1;i>=0;i--)
		{
			if(Character.isDigit(s.charAt(i)))
				res+=s.charAt(i);
		}
		System.out.println(res);
	}
*/
