package assessment;

import java.util.Scanner;

public class Account extends Customer{
	
	Scanner sc = new Scanner(System.in);
	
	protected int accNo;
	protected String custName;
	protected int balance;
	
	public Account(Customer customer) {
		super();
		this.accNo = customer.AccNumber;
		this.custName = customer.customerName;
		this.balance = customer.balance;
	}
	
	public void updateAcc() {
		System.out.println("Enter new Customer name: ");
		this.custName = sc.nextLine().trim();
		System.out.println("Charged for Updating Account: 100");
		this.balance = this.balance - 100;
		System.out.println("Present Balance: " + this.balance);
		System.out.println("Customer name changed to " + custName.toUpperCase());
		System.out.println("New username is " + custName.concat(Integer.toString(accNo)));
		System.out.println("Account Updated");
	}
	
	public void checkAcc() {
		System.out.println("Account number: " + accNo);
		System.out.println("Account Holder name: " + custName.toUpperCase());
		System.out.println("Account Balance: " + balance);
		int ind = custName.indexOf("@");
		if(custName.substring(ind, ind+6) == "@wipro") {
			System.out.println("It is an organisation account");
		}else {
			System.out.println("It is a personal account");
		}	
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", custName=" + custName + ", balance=" + balance + ", customerName="
				+ customerName + ", AccNumber=" + AccNumber + ", Address=" + Address + ", Phone=" + Phone + ", name="
				+ name + ", age=" + age + ", aadhar=" + aadhar + "]";
	}
		
}
