package entity.student;

import entity.Comparer;

public class NameComparer implements Comparer {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1 = (Student) o1;

		Student s2 = (Student) o2;

		return (s1.getName()).compareTo(s2.getName());
	}

}
