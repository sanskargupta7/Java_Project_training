package Inheritence;

public class Employee extends Person{
	
	protected int empId;
	protected String designation; 
	protected int salary;
	
	//protected Student s1;
	//private int empId;
	
	
	public Employee(int empId, String designation, int salary, String name, int	age, int ht, int wt, int aadhar, String caste) 
	{ super(name, age, ht, wt,	aadhar, caste); 
	this.empId = empId; 
	this.designation = designation;
	this.salary = salary; }
	
	
	
	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public Employee(Student s1) {
		super();
		//this.s1 = s1;
		this.empId = s1.rollno;
	}
	
	public Employee(String designation) {
		this.designation = designation;
	}


	public Employee(String name, int age, int empId) {
		super(name, age);
		this.empId = empId;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, int age, int ht, int wt, int aadhar, String caste) {
		super(name, age, ht, wt, aadhar, caste);
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	

	/*
	 * @Override public String toString() { return "Employee [empId=" + empId +
	 * ", designation=" + designation + ", salary=" + salary + ", name=" + name +
	 * ", age=" + age + ", ht=" + ht + ", wt=" + wt + ", aadhar=" + aadhar +
	 * ", caste=" + caste + "]"; }
	 */

	
	//public void hobby() {
	//	System.out.println("Employee:painting");
	//}
	
	
	
	

}
