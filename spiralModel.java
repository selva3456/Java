class spiralModel 
{
	public static void main(String[] args) 
	{
	    int[][]a={
			{1,2,3,4,5},
			{16,17,18,19,6},
			{15,24,25,20,7},
			{14,23,22,21,8},
			{13,12,11,10,9},
	    };
			int n=5;
			int left=0,right=n-1,top=0,bottom=n-1;
			while (left<=right && top<=bottom)
			{
				//left to right
				for (int i=left;i<=right ;i++ )
				{
					System.out.print(a[top][i]+" ");
				}
				top++;
				//top to bottom
				for (int i=top;i<=bottom ;i++ )
				{
					System.out.print(a[i][right]+" ");
				}
				right--;
				//right to left
				for (int i=right;i>=left ;i-- )
				{
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
				//bottom to top
				for (int i=bottom;i>=top ;i-- )
				{
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
	}
}
