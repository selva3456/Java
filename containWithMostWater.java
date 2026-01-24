class containWithMostWater 
{
	public static void main(String[] args) 
	{
       int[]a={1,8,6,2,5,4,8,3,7};
	   System.out.println(max_area(a));
	}
	public static int max_area(int[]a)
	{
		int s=0,v=a.length-1,Max_area=0;
		while (s<v)
		{
			int l=Math.min(a[s],a[v]);
			int b=v-s;
			int area=l*b;
			Max_area=Math.max(area,Max_area);
			if (a[s]<a[v])
				s++;
			else
				v--;
		}
		return Max_area;
	}
}
