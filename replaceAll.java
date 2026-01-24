import java.util.*;
class replaceAll 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	   String s1 = "abc123xyz";
       String ans1 = s1.replaceAll("[0-9]","");
	   String s2 = "Hello World Java";
       String ans2 = s2.replaceAll(" ", "_");
       String s3 = "education";
       String ans3 = s3.replaceAll("[aeiou]", "*");
       String s4 = "hello@123#java!";
       String ans4 = s4.replaceAll("[^a-zA-Z0-9]", "");
	   
	   System.out.println(ans1);
	   System.out.println(ans2);
	   System.out.println(ans3);
	   System.out.println(ans4);

	}
}
