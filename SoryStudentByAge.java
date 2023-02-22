package sdbms;

import java.util.Comparator;

public class SoryStudentByAge implements Comparator<Student> {
	public int compare(Student x, Student y) {
		return x.getAge()-y.getAge();
	}

	

}
