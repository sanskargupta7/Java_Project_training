package Inheritence;

public class Daily_wages extends Employee{
	
	protected int no_of_hours;
	protected int dwid;

	public Daily_wages(int empId, String designation, int salary, String name, int age, int ht, int wt, int aadhar,
			String caste, int no_of_hours, int dwid) {
		super(empId, designation, salary, name, age, ht, wt, aadhar, caste);
		this.no_of_hours = no_of_hours;
		this.dwid = dwid;
	}
	
	public Daily_wages(Manager m1) {
		super();
		this.dwid = m1.empId;
	}
	
	

	@Override
	public String toString() {
		return "Daily_wages [no_of_hours=" + no_of_hours + ", empId=" + empId + ", designation=" + designation
				+ ", salary=" + salary + ", name=" + name + ", age=" + age + ", ht=" + ht + ", wt=" + wt + ", aadhar="
				+ aadhar + ", caste=" + caste + "]";
	}

	
	

	
	

}
