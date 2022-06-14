package Exceptions;

import Inheritence.Employee;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("RPSUSERR81");
		
		try {
			if(((e1.getDesignation()).substring(0, 7))!="RPSUSER") {
				throw new PersonException("This is not a valid username");
			}
		}catch(PersonException e) {
			System.out.println(e);
		}

	}

}
