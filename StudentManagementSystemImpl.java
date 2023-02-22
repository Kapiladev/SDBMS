package sdbms;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class StudentManagementSystemImpl implements StudentManagementSystem{
	Scanner scan = new Scanner(System.in);
	LinkedHashMap<Integer,Student>db=new LinkedHashMap<Integer,Student>();
	@Override
	public void addStudent() {
		System.out.println("ENTER ID,NAME,AGE,MARKS");
		int id=scan.nextInt();
		String name=scan.next();
		int age=scan.nextInt();
		double marks=scan.nextDouble();
		//db.put(id,new Student(id,name,age,marks));
		Student std = new Student(id,name,age,marks);
		db.put(id,std);	 //db.put(std.getId(), std);
		System.out.println("Student record inserted successfully");
	}

	@Override
	public void removeStudent() {
		System.out.println("Enter Student ID :");
		int id=scan.nextInt();
		if(db.containsKey(id)) {
			db.remove(id);
			System.out.println("Student Record Deleted");
		}
		else {
			try {
				throw new StudentNotFoundException("Student Data Not Found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void removeallStudent() {
		db.clear();
		System.out.println("All Student record deleted ");
		
	}

	@Override
	public void displayStudent() {
		System.out.println("Enter Student id : ");
		int id=scan.nextInt();
		if(db.containsKey(id)) {
			Student std=db.get(id);
			System.out.println(std);
			System.out.println("id : "+std.getId());
			System.out.println("name : "+std.getName());
			System.out.println("age : "+std.getAge());
			System.out.println("marks : "+std.getMarks());
		}
		else {
			try {
				throw new StudentNotFoundException("Student Data Not Found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void displayallStudent() {
		Set<Integer> setOfKeys=db.keySet();
		for(Integer id :setOfKeys) {
			System.out.println(db.get(id));
//			for(Integer id :setOfKeys)
//			Student s=db.get(id);
//			System.out.println("id : "+s.getId()+"\t Name: "+s.getName());
//			System.out.println("\tAge : "+s.getAge()+"\t Marks: "+s.getMarks());
		}
		
	}

	@Override
	public void updateStudent() {
	System.out.println("Enter Student Id : ");
	int id=scan.nextInt();
	if(db.containsKey(id)) {
		Student s=db.get(id);
		System.out.println("1:upadte name\n2:update age\n3:update marks");
		System.out.println("Enter Choice : ");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter name : ");
			String name=scan.next();
			s.setName(name);
			break;
			
		case 2:
			System.out.println("Enter age : ");
			int age=scan.nextInt();
			s.setAge(age);
			break;
			
		case 3:
			System.out.println("Enter marks : ");
			double marks=scan.nextDouble();
			s.setMarks(marks);
			break;
			
			default:
				System.out.println("Invalid Choice");
		}
		System.out.println("Student data updated successfully");
		
	}
	else {
		try {
			throw new StudentNotFoundException("Student Data Not Found");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	}

	@Override
	public void countStudent() {
		System.out.println("number of students detail added is : "+db.size());
		
	}

	@Override
	public void sortStudent() {
		ArrayList<Student> l=new ArrayList<Student>();
		Set<Integer> s =db.keySet();
		for(int id:s) {
			l.add(db.get(id));
		}
		System.out.println("1:Sort based on ID\n2:Sort based on name");
		System.out.println("3:Sort based on marks\n4:Sort based on age");
		System.out.println("Enter Choice");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1 :
			Collections.sort(l,new SortStudentById());
			for(Student s1:l) {
				System.out.println(s1);
		}
			break;
			
		case 2 :
			Collections.sort(l,new SortStudentByMarks());
			for(Student s1:l) {
				System.out.println(s1);
		}
			break;
			
		case 3 :
			Collections.sort(l,new SoryStudentByAge());
			for(Student s1:l) {
				System.out.println(s1);
		}
			break;
			
		case 4:
			Collections.sort(l,new SoryStudentByAge());
			for(Student s1:l) {
				System.out.println(s1);
		}
				break;
				
				default:
					System.out.println("Invalid EveryThing");
		}
		
			
		}
		
		
	

}
