package app;

public class Cmd2 {

	public static void main(String[] args) {
		int sum=0;
		int n=args.length;
		int []a=new int[n];
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;++i) {
		
		a[i]=Integer.parseInt(args[i]);
		sum+=a[i];	
		if(a[i]>max)
		{
			max=a[i];
		}
		}
		System.out.println("Summation is of cmd arguments:"+sum);
		System.out.println("Maximum element in cmd arguments:"+max);
	

	}

}
