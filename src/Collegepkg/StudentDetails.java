package Collegepkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		ArrayList<StudentPojo> students = new ArrayList<StudentPojo>();
 		
		StudentPojo s1 = new StudentPojo(1, "Pamela", 3, "IT", 56);
		students.add(s1);
		StudentPojo s2 = new StudentPojo(2, "Michael", 4, "EC", 71);
		students.add(s2);
		
		students.add(new StudentPojo(3, "Robin", 3, "El", 82));
		students.add(new StudentPojo(4, "Charlie", 4, "ME", 45));
		
		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\Java Project\\src\\Collegepkg\\Students_details");
		if(file.exists()) {
			Scanner s = new Scanner(file);
			System.out.println("Student Details");
			while(s.hasNextLine()) {
				StudentPojo stud = new StudentPojo();
				stud.setRollnumber(s.nextInt());
				stud.setName(s.next());
				stud.setMarks(s.nextInt());
				students.add(stud);
			}
			for(StudentPojo sp : students) {
				System.out.println(sp);
			}
			
		}
		

	}

}
