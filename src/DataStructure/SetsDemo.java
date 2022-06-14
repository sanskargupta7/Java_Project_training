package DataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class SetsDemo {
	

	private static void insertionOrder()
	{
		LinkedHashSet<String> lhs1
			= new LinkedHashSet<>();
		TreeSet<String> ts1 = new TreeSet<>();
		HashSet<String> hs1 = new HashSet<String>();

		for (String str : Arrays.asList("Sanskar", "Gupta",
										"Wipro", "Velocity")) {

			lhs1.add(str);
			ts1.add(str);
			hs1.add(str);
		}

		System.out.println("Insertion Order"
						+ " in HashSet :"
						+ hs1);

		System.out.println("Insertion Order "
						+ "in LinkedHashSet :"
						+ lhs1);

		System.out.println("Insertion Order "
						+ "in TreeSet :"
						+ ts1);
		
		LinkedHashSet<Integer> lhs2
		= new LinkedHashSet<>();
	TreeSet<Integer> ts2 = new TreeSet<>();
	HashSet<Integer> hs2 = new HashSet<Integer>();

	for (Integer inte : Arrays.asList(1, 2, 4, 7, 8, 6, 5, 7)) {

		lhs2.add(inte);
		ts2.add(inte);
		hs2.add(inte);
	}

	System.out.println("Insertion Order"
					+ " in HashSet :"
					+ hs2);

	System.out.println("Insertion Order "
					+ "in LinkedHashSet :"
					+ lhs2);

	System.out.println("Insertion Order "
					+ "in TreeSet :"
					+ ts2);
	}


	private static void deletion()
	{
		HashSet<Integer> deletionHS = new HashSet<>();

		for (int i = 0; i < 1000; i++) {
			deletionHS.add(i);
		}

		long startingTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			deletionHS.remove(i);
		}

		long endedTime = System.nanoTime();
		System.out.println(
			"Total time to Deletion "
			+ "1000 elements in HashSet in nanoseconds: "
			+ Math.abs(startingTime - endedTime));

		LinkedHashSet<Integer> deletionLLS
			= new LinkedHashSet<>();

		for (int i = 0; i < 1000; i++) {
			deletionLLS.add(i);
		}
		startingTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			deletionLLS.remove(i);
		}

		endedTime = System.nanoTime();
		System.out.println(
			"Total time to Deletion 1000"
			+ " elements in LinkedHashSet in nanoseconds: "
			+ Math.abs(startingTime - endedTime));

		TreeSet<Integer> deletionTS = new TreeSet<>();

		for (int i = 0; i < 1000; i++) {
			deletionTS.add(i);
		}

		startingTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			deletionTS.remove(i);
		}

		endedTime = System.nanoTime();
		System.out.println(
			"Total time to Deletion 1000"
			+ " elements in TreeSet in nanoseconds: "
			+ Math.abs(startingTime - endedTime));
	}

	public static void main(String args[])
	{
		insertionOrder();
		deletion();
	}
}

