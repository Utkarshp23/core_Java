package app;
import java.util.Scanner;

import entity.Box;
public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Box [] b= new Box[3];
			Scanner sc= new Scanner(System.in);
			
			int l;
			int b_;
			int h;
			
			int max=0;
			for(int i=0;i<b.length;++i)
			{
				System.out.println("Enter lenghth, breadth & height of box-"+(i+1));
				l=sc.nextInt();
				b_=sc.nextInt();
				h=sc.nextInt();
				b[i]=new Box(l,b_,h);
				b[i].displayV();
				if(b[i].volume()>=max)
				{
					max=b[i].volume();
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("Maximum Volume is :"+max);
		
	}

}
