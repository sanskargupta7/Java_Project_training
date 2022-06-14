package DataStructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

import mypkg.Product;

public class StackSample {
	
	
	public static void queue_collections() {
		Queue<Float> queue = new PriorityQueue<Float>();
		
		queue.add(2.3f);
		queue.add((float)4.3);
		System.out.println("Elements");
		queue.forEach(System.out::println);
		
		Queue<Float> q1 = new PriorityBlockingQueue<Float>();
		Queue<Float> q3 = new LinkedList<Float>();
		
		q1.add(2.3f);
		q1.add((float)4.3);
		q1.addAll(queue);
		
		System.out.println("Elements in Queue1:");
		q1.forEach(System.out::println);
		Queue<Float> q4;
		q4 = q1;
		
		for(Float i:q4);
		
		System.out.println(q1.contains(q3));
		System.out.println(q1.containsAll(queue));
		System.out.println(q1.equals(q3));
		System.out.println(q4.poll());
	}
	
	public static void main(String[] args) {
		
		//Stack<Integer> stk = new Stack<Integer>();
		
		Vector<Integer> vector = new Vector<Integer>();
		
		/*
		 * stk.push(100); stk.push(200); stk.push(300);
		 * 
		 * for(Integer item: stk) System.out.println(item);
		 * 
		 * stk.pop();
		 * 
		 * for(Integer item: stk) System.out.println(item);
		 * 
		 * System.out.println(stk.peek());
		 */
		
		vector.add(1000);
		vector.add(2000);
		
		for(Integer item: vector) 
			System.out.println(item);
		
		
		System.out.println("without loop");
		System.out.println(vector);
		
		//System.out.println(stk.search(100)); //returns distance from top 1, 2, 3 ....
		
		Product p1 = new Product(100, "Mobile");
		Product p2 = new Product(200, "Laptop");
		Product p3 = new Product(300, "Laptop Charger");
		Stack<Product> stack = new Stack<Product>();
		stack.add(0, p2);
		stack.add(1, p1);
		stack.push(p3);
		
		stack.forEach(System.out::println);
		
		stack.addElement(p3);
		stack.addElement(new Product(400, "Mouse"));
		stack.forEach(System.out::println);
		
		for(int i = stack.size(); i>100; i--)
			stack.pop();
		
		
		queue_collections();
		
	}
	
	

}
