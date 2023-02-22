package sdbms;

import java.util.Comparator;

import JavaBeanClass.Student;

public class SortByStudntName implements Comparator<Student>{
	public int compare(Student x,Student y) {
		return x.getName().compareTo(y.getName());
	}

}
