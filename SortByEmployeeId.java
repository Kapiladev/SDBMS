package sdbms;

import java.util.Comparator;

public class SortByEmployeeId implements Comparator<Employee>{ 
    public int compare(Employee x,Employee y) {
	return x.id-y.id;
}
}
