package Exceptions;

import java.util.*;

public class ExTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("Denominator cannot be equal to 0");
		}catch(NumberFormatException e) {
			System.out.println("Enter the amount in digits");
		}finally {
			System.out.println("close the resource");
			sc.close();
		}

	}

}
