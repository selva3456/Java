import java.util.*;
class anagram 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	   String s1 = "Listen";
       String s2 = "Silent";
       String s3 = "Hello";
       String s4 = "World";
       String s5 = "A decimal point";
       String s6 = "I'm a dot in place";
	   		   
	   System.out.println(s1+" and "+s2+" are anagrams::"+areAnagram(s1,s2));
	   if(areAnagram(s1,s2))
		   System.out.println("IT IS ANAGRAM");
	   else
		   System.out.println("IT IS NOT ANAGRAM");
	   System.out.println(s3+" and "+s4+" are anagrams::"+areAnagram(s3,s4));
	    if(areAnagram(s3,s4))
		   System.out.println("IT IS ANAGRAM");
	   else
		   System.out.println("IT IS NOT ANAGRAM");

	   System.out.println(s5+" and "+s6+" are anagrams::"+areAnagram(s5,s6));
	     if(areAnagram(s5,s6))
		   System.out.println("IT IS ANAGRAM");
	   else
		   System.out.println("IT IS NOT ANAGRAM");
  
	}
	public static boolean areAnagram(String str1,String str2)
	{
		 if(str1.length()!=str2.length())
		     return false;
		 str1=str1.toLowerCase();
		 str2=str2.toLowerCase();
		 
		 char[]a=str1.toCharArray();
		 char[]b=str2.toCharArray();
		 
		 Arrays.sort(a);
		 Arrays.sort(b);
		 
		 return Arrays.equals(a,b);
	}
	
}
