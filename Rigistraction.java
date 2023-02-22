package sdbms;
import java.util.Scanner;
public class Rigistraction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentManagementSystem st =new StudentManagementSystemImpl();
		while(true) {
		System.out.println("1:ADD STUDENT\n2:REMOVE STUDENT");
		System.out.println("3:REMOVE ALL STUDENT\n4:DISPLAY STUDENT");
		System.out.println("5:DISPLAY ALL STUDENT\n6:UPDATE STUDENT");
		System.out.println("7:COUNT STUDENT\n8:SORT STUDENT");
		System.out.println("9:EXIT");
		System.out.println("ENTER CHOICE :");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			st.addStudent();
			break;
			
		case 2:
			st.removeStudent();
			break;
			
		case 3:
			st.removeallStudent();
			break;
			
		case 4:
			st.displayStudent();
			break;
			
		case 5:
			st.displayallStudent();
			break;
			
		case 6:
			st.updateStudent();
			break;
			
		case 7:
			st.countStudent();
			break;
			
		case 8:
			st.sortStudent();
			break;
			
		case 9:
			System.out.println("thank you !");
			System.exit(0);
			
			default:
				System.out.println("Invalid enter number plez enter the correct number");
		}
		System.out.println("-------");
		}
	}
}
