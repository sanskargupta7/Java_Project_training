package Inheritence;

import java.time.LocalDateTime;

public class Main {
	
	public static void main(String args[]) {
		Student s1 = new Student(1, "ABC", "Joseph", 60);
		Student s2 = new Student(2, "A", "Josh", 6);
		Student s3 = new Student(3, "C", "Jo", 16);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("Array of objects");
		Student stud[] = new Student[30];
		stud[0] = new Student(1, "ABC", "Joseph", 60);
		stud[1] = new Student(2, "A", "Josh", 6);
		stud[2] = new Student(3, "C", "Jo", 16);
		
		for(int i=0; i<stud.length; i++) {
			System.out.println(stud[i]);
		}
		
		System.out.println();
		
		System.out.println("*******Enhanced for loop*************");
		for(Student i: stud) {
			System.out.println(i);
		}
		
		//Employee e1 = new Employee(101, "HR", 10000, "Raj", 30, 170, 60, 12345, "Hindu");
		//System.out.println(e1);
		
		Manager m1 = new Manager(201, "Project Lead", 20000, "Rajesh", 40, 172, 65, 45688, "Muslim", "Development", 5);
		System.out.println(m1);
		
		
		Daily_wages d1 = new Daily_wages(278, "Accountant", 9000, "Yash", 25, 168, 60, 89076, "Hindu", 300, 23);
		System.out.println(d1);
		
		//e1.hobby();
		s1.hobby();
		
		Employee e1 = new Employee(s1);
		Daily_wages d2 = new Daily_wages(m1);
		
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1);
		System.out.println(dt1.getHour());
		System.out.println(dt1.getYear());
		System.out.println(dt1.getDayOfYear());
		System.out.println(dt1.plusHours(2));
		
	}

}
