package Example;

public class Employee {
	
	int eid;
	String name;
	
	Employee(){
		
	}
	
	Employee(int id, String n){
		eid = id;
		name = n;
	}
	
	void show() {
		System.out.println("The employee name is: " + name);
		System.out.println("The employee id is: " + eid);
	}

}
