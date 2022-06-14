package Collection;

import java.util.*;
import Inheritence.Person;

public class DisplayPersons {
	
	public static void display(LinkedList<Person> ppl) {
		System.out.println("*******Collection*********");
		ppl.forEach(System.out::println);
		
		
		Person p = ppl.get(0);
		System.out.println("John age is: " + p.getAge());
		if(p.getAge() < 18) {
			System.out.println("Minor Account creation is allowed");
		}else {
			System.out.println("Account creation is allowed");
		}
		System.out.println(ppl.get(1));
		
	}
	
	public static void displayAge(Person p) {
		System.out.println(p.getAge());
	}
	
	public static void showname(String person_name) {
		System.out.println(person_name.toUpperCase());
	}

}
