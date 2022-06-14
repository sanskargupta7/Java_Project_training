package Inheritence;

public class Person {
	
	protected String name;
	protected int age;
	protected int ht;
	protected int wt;
	protected int aadhar;
	protected String caste;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Person(String name, int age, int ht, int wt, int aadhar, String caste) {
		super();
		this.name = name;
		this.age = age;
		this.ht = ht;
		this.wt = wt;
		this.aadhar = aadhar;
		this.caste = caste;
	}
	
	public void hobby() {
		System.out.println("Person:Painting");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	

}
