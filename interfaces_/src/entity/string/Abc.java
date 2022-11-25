package entity.string;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		for (int i = 0; i < a.length(); ++i) {
			int m = (int) (a.charAt(i));
			boolean f = false;
			if (m >= 65 && m <= 90)
				f = true;

			if (f)
				System.out.println(a.charAt(i) + " - " + "UpperCase  -" + (char) (a.charAt(i) + 32));
			else {
				System.out.println(a.charAt(i) + " - " + "LowerCase  -" + (char) (a.charAt(i) - 32));
			}
		}
		String s1="";
		for (int i = a.length() - 1; i >= 0; i--) {
			s1+=a.charAt(i);
		}
		System.out.print(s1);
	
	char [ ] z="harshad".toCharArray();
	int i=0;
	for(char t:z)
		i++;
	System.out.println(i);

}
}
