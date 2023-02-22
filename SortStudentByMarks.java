package sdbms;

import java.util.Comparator;


public class SortStudentByMarks implements Comparator<Student>{
	public int compare(Student x,Student y) {
		return x.getMarks().compareTo(y.getMarks());
	}
}
