package app;

public class Cmd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=args.length;
		if(n==2)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println("Addition:"+(a+b));
			System.out.println("Sublstraction:"+ (a>b ? a-b: b-a ));
			System.out.println("Multiplication:"+(a*b));
			System.out.println("Division:"+((float)a/b));
		}
	}

}
