package entity.string;

public class NewString implements StringOperations {

	@Override
	public void reverse(String s) {
		// TODO Auto-generated method stub
		int n = length(s);
		int i = n - 1;
//		   str[i]=s.toCharArray();
		String s1 = "";

		while (i >= 0) {
			s1 += s.charAt(i);
			i--;
		}
		System.out.println(s1);
	}

	@Override
	public void toUpperCase(String s) {
		// TODO Auto-generated method stub
		String s1 = "";
		int i = 0;
		while (i < length(s)) {
			s1 += (char) (s.charAt(i) - 32);
			i++;
		}
		System.out.println(s1);
	}

	@Override
	public int length(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			for (i = 0;; i++)
				s.charAt(i);

		} catch (Exception e) {
		}
		return i;
	}

	@Override
	public boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int n = length(s);
		boolean f = true;
		for (i = 0; i < n / 2; ++i) {

			if (s.charAt(i) != s.charAt(n - i - 1)) {
				f = false;
				break;
			}
		}

		return f;
	}
	
	public String append(String s1, String s2)
	{
		s1+=s2;
		return s1;
	}

}
