package entity.student;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s = new Student[5];
		s[0] = new Student(13, "Harshad", 68);
		s[1] = new Student(5, "Rahul", 89);
		s[2] = new Student(36, "Keshav", 96);
		s[3] = new Student(106, "Utkarsh", 23);
		s[4] = new Student(15, "Anand", 70);

		NameComparer n = new NameComparer();
		RollComparer r = new RollComparer();
		MeritComparer m = new MeritComparer();

		for (int i = 0; i < s.length; ++i) {
			for (int j = i + 1; j < s.length; ++j) {
				int k = n.compare(s[i], s[j]);

				if (k > 0) {

					Student temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}

		}
		for (int k = 0; k < s.length; ++k) {
			System.out.println(s[k].getName());

		}
		System.out.println("----------");

		for (int i = 0; i < s.length; ++i) {
			for (int j = i + 1; j < s.length; ++j) {
				int k = r.compare(s[i], s[j]);

				if (k > 0) {

					Student temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}

		}
		for (int k = 0; k < s.length; ++k) {
			System.out.println(s[k].getRoll());

		}
		System.out.println("----------");
		for (int i = 0; i < s.length; ++i) {
			for (int j = i + 1; j < s.length; ++j) {
				int k = m.compare(s[i], s[j]);

				if (k > 0) {

					Student temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}

		}
		for (int k = 0; k < s.length; ++k) {
			System.out.println(s[k].getMarks());

		}
		System.out.println("----------");

	}

}
