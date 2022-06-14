package Collection;

import java.util.*;
import Inheritence.Person;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Person> ppl = new LinkedList<Person>();
		Person p1 = new Person("John", 40);
		ppl.add(p1);
		ppl.add(new Person("Jack", 45));
		
		DisplayPersons.display(ppl);
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(100);
		obj.add(200);
		obj.add(400);
		
		obj.forEach((n)->{System.out.println(obj);});
		
		obj.forEach((n)->{n=n*2;});
	}
	
	
	

}
