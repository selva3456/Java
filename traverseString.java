/*class traverseString
{
	public static void main(String[] args) 
	{
		String s="spider man";
		for (int i=0;i<s.length();i++ )
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for (int i=s.length()-1;i>=0 ;i-- )
		{
			System.out.print(s.charAt(i));
		}
	}
}*/
import java.util.*;
class traverseString
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t Enter Sentence:");
		String sentence=sc.nextLine();
		System.out.println("Entered Word is:"+sentence);
		System.out.print("\t\t Enter Word:");
		String word=sc.next();
		System.out.println("Entered word is:"+word);
		
	}
}
