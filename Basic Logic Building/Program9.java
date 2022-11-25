public class Pattern11
{
	
	public static void main(String []args)
	{	
		int n=5;
		
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<(2*n-1);++j)
			{
				if( (j>=(2*n-1)/2 - i)  && (j<=(2*n-1)/2 + i))
				{
					int k=0;
					if((2*n-1)/2 >=j)
					{
						k=(2*n-1)/2 - j;
					}else{
						k=j-(2*n-1)/2;
					}
					System.out.print(i+1-k);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
