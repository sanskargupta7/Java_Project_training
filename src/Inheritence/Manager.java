package Inheritence;

public class Manager extends Employee {
	
	protected String dept;
	protected int projects;
	
	public Manager(int empId, String designation, int salary, String name, int age, int ht, int wt, int aadhar,
			String caste, String dept, int projects) {
		super(empId, designation, salary, name, age, ht, wt, aadhar, caste);
		this.dept = dept;
		this.projects = projects;
	}
	
	
	
	@Override
	public String toString() {
		return "Manager [dept=" + dept + ", projects=" + projects + ", empId=" + empId + ", designation=" + designation
				+ ", salary=" + salary + ", name=" + name + ", age=" + age + ", ht=" + ht + ", wt=" + wt + ", aadhar="
				+ aadhar + ", caste=" + caste + "]";
	}
	
	

	
	
	

	
	
	

}
