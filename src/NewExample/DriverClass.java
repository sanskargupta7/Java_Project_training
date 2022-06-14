package NewExample;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile(123, "Nokia", 20000, "A");
		Mobile m3 = new Mobile(234, "Samsung", 25000, "B");
		Mobile m4 = new Mobile("Apple", 40000);
		Mobile m5 = new Mobile("Lenovo", 15000, "A");
		
		m1.display();
		m2.display();
		m3.display();
		m4.display();
		m5.display();
		
		System.out.println("The mobile Id of m3 is: " + m3.getMid());
		System.out.println("The company name of m3 is: " + m3.getCompanyName());
		System.out.println("The cost of m3 is: " + m3.getCost());
		System.out.println("Quality Grade of m5 is " + m5.getQG());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter new Cost for m3: ");
		int nc = sc.nextInt();
		m3.setCost(nc);
		
		System.out.println();
		
		System.out.println("Enter new Quality Grade for m5: 'C'");
		m5.setQG("C");
		
		System.out.println("New cost of m3 is: " + m3.getCost());
		System.out.println("New Quality Grade of m5 is " + m5.getQG());
		
		Mobile.type();
	}

}
