package DataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {
	
	public static void set_collections() {
		
		Character[] ch = {'a', 'b', 'c', 'b', 'e'};   //Array to list
		Set<Character> set = new HashSet<Character>();
		set.addAll(Arrays.asList(ch));    //convert "ch" array to list
		set.add('d'); //this d will be added in the alphebetical order in set i.e. before e
		
		for(Character item:set) {
			System.out.println(item);
		}
		
		Set<Character> s2 = new LinkedHashSet<Character>();
		s2.addAll(set);
		System.out.println("set2 elements");
		s2.add('f');
		s2.add('g');
		
		for(Character item: s2)
			System.out.println(item);
		
		System.out.println("After intersetion");
		
		s2.retainAll(set);    //intersection of two sets
		s2.forEach(System.out::println);
		
		s2.add('f');
		s2.add('g');
		
		//Difference
		System.out.println("set - s2");
		s2.removeAll(set);
		s2.forEach(System.out::println);
		
	}
	
	public static void sortedset_collections() {
		
		
		Character[] ch = {'a', 'b', 'c', 'b', 'e'};
		SortedSet<Character> set1 = new TreeSet<Character>();
		set1.addAll(Arrays.asList(ch));
		set1.add('d');
		
		System.out.println(set1.isEmpty());
		System.out.println();
		System.out.println(set1.hashCode());
		System.out.println();
		System.out.println(set1.removeIf(item->item=='a'));
		set1.forEach(System.out::println);
		System.out.println();
		System.out.println(set1.getClass());
		System.out.println();
		System.out.println(set1.headSet('c'));
		System.out.println();
		set1.forEach(System.out::println);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set_collections();
		sortedset_collections();

	}

}
