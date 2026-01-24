import java.util.*;
class linearSearch 
{
	public static void main(String[] args) 
	{
		String[]girls={"samantha","pooja","harini","priya","kani","sweety"};
		
	}
	public static String search(String[]girls,String name)
	{
		for (int i=0;i<girls.length ;i++ )
		{
			if(girls[i]==name)
				return girls[i];
		}
		return -2;
	}
}