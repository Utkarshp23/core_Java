package entity.student;

import entity.Comparer;

public class MeritComparer implements Comparer {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
//		Student s1;
//		Student s2;
		// if(o1 instanceof Student)
		Student s1 = (Student) o1;
		// if(o2 instanceof Student)
		Student s2 = (Student) o2;

		if (s1.getMarks() > s2.getMarks())
			return 1;

		return 0;
	}

}
