public class SumPat
{
	
	public static void main(String []args)
	{	
		int n=5;
		int [][] a;
		a=new int[n][2*n-1];
		a[0][(2*n-1)/2]=1;
		//System.out.println(a[0][0]);
		
		for(int i=1;i<n;++i)
		{
			for(int j=0;j<(2*n-1);++j)
			{
				if(j==0)
				{
					a[i][j]=a[i-1][j+1];
					//System.out.println(i+" "+j+" "+a[i][j]+" "+a[i-1][j+1]);
					continue;
				}
				if(j==(2*n-2))
				{
					a[i][j]=a[i-1][j-1];
					//System.out.print(a[i][j]);
					continue;
				}
				a[i][j]=a[i-1][j-1]+a[i-1][j+1];
				//System.out.print(a[i][j]);
			}
			System.out.println();
		}

		for(int i=0;i<n;++i)
		{
			for(int j=0;j<(2*n-1);++j)
			{
				if(a[i][j]!=0)
				System.out.print(a[i][j]);
				else
				System.out.print(" ");
			}
			System.out.println();
		}

		//System.out.println(a[4][0]);
		
		
	}

}
