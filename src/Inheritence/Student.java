package Inheritence;

public class Student extends Person implements Habit{
	
	protected int rollno;
	private String dept;
	
	public Student(int rollno, String dept, String name, int age) {
		super(name, age);
		this.rollno = rollno;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", dept=" + dept + ", name=" + name + ", age=" + age + "]";
	}
	
	public void hobby() {
		//super.hobby();
		System.out.println("Student:painting");
	}
	
	public void funnyHabit() {
		System.out.println("Kidding Friends");
	}
	

}
