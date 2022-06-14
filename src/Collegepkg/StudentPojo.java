package Collegepkg;

public class StudentPojo {
	
	private int rollnumber;
	private String name;
	private int year;
	private String branch;
	private int marks;
	//static String college = "ABC";
	
	
	
	public StudentPojo() {
		super();
		this.year = 4;
		this.branch = "CSE";
	}
	
	public StudentPojo(int rollnumber, String name, int year, String branch, int marks) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.year = year;
		this.branch = branch;
		this.marks = marks;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentPojo [rollnumber = " + rollnumber + ", name = " + name + ", year = " + year + ", branch = " + branch
				+ ", marks = " + marks + "]";
	}
	
}
