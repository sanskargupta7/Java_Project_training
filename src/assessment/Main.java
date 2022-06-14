package assessment;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		
		Person p1 = new Person("Maya", 23, 12345);
		Person p2 = new Person("May", 19, 12745);
		Person p3 = new Person("Maira", 25, 14645);
		Person p4 = new Person("Sanjeev", 30, 13545);
		Person p5 = new Person("Dhairya", 35, 53213);
		Customer c1 = new Customer(p1, 11123, "New Delhi", 1234524890, 25000);
		Customer c2 = new Customer(p2, 11257, "Kolakata", 1234517890, 1000);
		Customer c3 = new Customer(p3, 89011, "Mumbai", 1234523890, 25000);
		Customer c4 = new Customer(p4, 12789, "Guragaon", 1234975890, 35000);
		Customer c5 = new Customer(p5, 75389, "Jaipur", 678975890, 500);

		Account a1 = new Account(c1);
		Account a2 = new Account(c2);
		Account a3 = new Account(c3);
		Account a4 = new Account(c4);
		Bank b1 = new Bank(c1, 500000);
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
		accounts.add(a4);
		
		//accounts.forEach(System.out::println);
		
		//accounts.add(new Account(c5));
		//System.out.println("Is the arraylist empty?");
		//System.out.println(accounts.isEmpty());
		//accounts.remove(3);
		//System.out.println();
		
		//accounts.forEach(System.out::println);
		
		//accounts.clear();
		
		//System.out.println("Is the arraylist empty?");
		//System.out.println(accounts.isEmpty());
		
		accounts.forEach(System.out::println);
		
		for(Account a : accounts) {
			try {
				if(a.balance < 1500) {
					throw new BankException("You cant have balance lower than minimum");
				}
			}catch(BankException e){
				System.out.println(e);
			}
		}
		
		System.out.println();
		c1.createAccount();
		System.out.println();
		c1.deposit();
		System.out.println();
		c1.withdraw();
		System.out.println();
		
		a1.updateAcc();
		System.out.println();
		a1.checkAcc();
		System.out.println();
		
		b1.giveLoan();
		System.out.println();
		b1.updateDetails();
		System.out.println();
		b1.collectMoney();
		System.out.println();
		b1.transaction();
	}

}
