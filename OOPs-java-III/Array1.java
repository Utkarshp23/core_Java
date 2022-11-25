public class Array1
{
	public static void main(String[] args)
	{
		int [] arr={7,1,-9,4,19,4};
		int min=arr[0];
		int max=arr[0];
		float avg=arr[0];

		for(int i=1;i<arr.length;++i)
		{
			if(arr[i]<=min) min=arr[i];
			if(arr[i]>=max) max=arr[i];
			avg+=arr[i];
			if(i==arr.length-1) avg/=arr.length;
		}

		System.out.println("Min Element is: " + min);
		System.out.println("Max Element is: " + max);
		System.out.println("Avg of Element is: " + avg);
     

	}
}