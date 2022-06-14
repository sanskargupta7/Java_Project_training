package assessment;

import java.util.*;

public class Customer extends Person{
	
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	protected String customerName;
	protected int AccNumber;
	protected String Address;
	protected int Phone;
	protected int balance;
	
	public Customer(Person person, int accNumber, String address, int phone, int balance) {
		customerName = person.name;
		this.AccNumber = accNumber;
		this.Address = address;
		this.Phone = phone;
		this.balance = balance;
	}
	
	public Customer(String customerName, int accNumber, String address, int phone) {
		super();
		this.customerName = customerName;
		AccNumber = accNumber;
		Address = address;
		Phone = phone;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int age, int aadhar) {
		super(name, age, aadhar);
		// TODO Auto-generated constructor stub
	}


	public void createAccount() {
		System.out.println("Enter custome name: ");
		name = sc.nextLine().trim();
		
		AccNumber = rand.nextInt(1000000);
		
		System.out.println("Enter Address: ");
		Address = sc.nextLine().trim();
		
		System.out.println("Enter Phone: ");
		Phone = sc.nextInt();
		
		System.out.println("Enter balance: ");
		balance = sc.nextInt();
		
		System.out.println("Account Created:");
		System.out.println("Name: " + name);
		System.out.println("Account Number: " + AccNumber);
		System.out.println("Phone: " + Phone);
		System.out.println("Balance: " + balance);
	}
	
	public void deposit() {
		System.out.println("Enter the amount you want to deposit: ");
		int money = sc.nextInt();
		balance += money;
		System.out.println(money + " is deposited successfully.");
		System.out.println("New Balance is " + balance);
	}
	
	public void withdraw() {
		System.out.println("Enter the amount you want to withdraw: ");
		int money = sc.nextInt();
		balance -= money;
		System.out.println(money + " is withrawn successfully.");
		System.out.println("New Balance is " + balance);
	}

}
