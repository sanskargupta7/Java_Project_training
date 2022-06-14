package newclass1;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UtilClass utilClass = new UtilClass(20, 10);
		//utilClass.arithmetic();
		//utilClass.relational();
		//utilClass.logical();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for the table: ");
		
		int a = sc.nextInt();
		UtilClass.table(a);
		
		sc.close();
	}

}
