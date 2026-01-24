import java.util.*;
class frequencyOfElement 
{
	public static void main(String[] args) 
	{
		int[]a={0,21,9,46,7,7,7,14,0,2,7,2,9,98,46,21,23};
		frequency(a);
	}
	public static void frequency(int[]a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]==Integer.MIN_VALUE)
				continue;
			int count=1;
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i]==a[j])
				{
	             count++;
				a[j]=Integer.MIN_VALUE;
				}
			}
			System.out.println(a[i]+"-"+count);
		}
	}
}
