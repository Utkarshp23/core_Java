package entity;

public class MyNumber implements IntOperations {
	private int n;

	public MyNumber(int n) {
		super();
		this.n = n;
	}

	public boolean isEven() {
		if (n % 2 == 0)
			return true;
		return false;
	}

	public boolean isOdd() {
		if (n % 2 != 0)
			return true;
		return false;
	}

	public boolean isPrime() {
		boolean flag = false;
		if (n < 2)
			return flag;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		return !flag;
	}

	public double calcFactorial() {
		int temp = n;
		int k = 1;
		while (temp > 0) {
			k *= temp;
			temp--;
		}
		return k;
	}
}
