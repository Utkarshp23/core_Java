public class Array2
{
	public static void main(String[] args)
	{
		int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
		int [][] rowS={{0},{0},{0}};
		int [][] colS={{0},{0},{0}};

		for(int i=0;i<arr.length;++i)
		{
			for(int j=0;j<arr[i].length;++j)
			{
				rowS[i][0]+=arr[i][j];
				colS[i][0]+=arr[j][i];
			}
		}
		
		System.out.println("Row Sum is:");
		for(int i=0;i<rowS.length;++i) 
			System.out.println(rowS[i][0]);

		System.out.println("Column Sum is:");
		for(int i=0;i<colS.length;++i) 
			System.out.println(colS[i][0]);
		
     

	}
}