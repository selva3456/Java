class sunrise 
{
	public static int countVisibleSunrise(int[]a)
	{
		int largest=a[0],count=1;
		for (int i=1;i<a.length ;i++ )
		{
			if(a[i]>largest)
				count++;
			largest=a[i];
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int[]a={4,5,3,2,7,9};
		System.out.println(countVisibleSunrise(a));
	}
}
//sunrise la a[0]=4 sunrise building mela adikaila starting entha building irunthalum athulatha sun padum 
//so athunala largest la a[0] nu store panirom and count ipa 1 agirum