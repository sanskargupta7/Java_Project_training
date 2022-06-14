package assessment;

import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bank extends Customer{
	
	Scanner sc = new Scanner(System.in);
	Random ra = new Random();
	
	protected int transNo;
	protected int BankBalance;
	private int bal;
	private String uname;
	
	public Bank(Customer c, int BankBalance) {
		this.BankBalance = BankBalance;
		this.bal = c.balance;
		this.uname = c.customerName;
	}
	
	public boolean giveLoan() {
		System.out.println("Enter the loan amount: ");
		int money = sc.nextInt();
		if(money < BankBalance && bal < money) {
			BankBalance -= money;
			bal += money;
			System.out.println("Loan of " + money + " is Issued");
			System.out.println("Loan Issue Date and Time : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
			return true;
		}else {
			System.out.println("We apologise, Loan cannot be issued.");
			return false;
		}
	}
	
	
	public int updateDetails() {
		System.out.println("Update the pin");
		System.out.println("Enter old pin: ");
		int pin = sc.nextInt();
		if(pin == 1234) {
			System.out.println("Enter new pin: ");
			int pinn = sc.nextInt();
			if(pinn == 1234) {
				System.out.println("old pin cannot be the new pin");
				return 0;
			}else {
				System.out.println("Pin changed");
				return 1;
			}
		}else {
			System.out.println("Incorrect pin. Update failed.");
			return 0;
		}
	}
	
	public int collectMoney() {
		System.out.println("Enter the amount of money you want to collect: ");
		int money = sc.nextInt();
		if(money <= bal) {
			System.out.println("The amount can be collected");
			bal -= money;
			System.out.println("your account balance is: " + bal);
			return money;
		}else {
			System.out.println("You dont have enough balance.");
			return -1;
		}
	}
	
	public boolean transaction() {
		System.out.println("Enter the account number to send money to: ");
		int acn = sc.nextInt();
		System.out.println("Enter the amount: ");
		int money = sc.nextInt();
		System.out.println("Enter pin: ");
		int pin = sc.nextInt();
		if(money > bal) {
			System.out.println("Not enough funds for transaction");
			System.out.println("Transaction Failed");
			return false;
		}
		if(pin==1234) {
			System.out.println("Transaction Successful");
			System.out.println(money + " sent to " + acn);
			int tid = ra.nextInt();
			String TID = uname.concat(Integer.toString(tid));
			System.out.println("Transaction id " + TID);
			bal -= money;
			System.out.println("Account balance now is " + bal);
			return true;
		}else {
			System.out.println("Incorrect pin");
			System.out.println("Transaction Failed");
			return false;
		}
	}
	
	public boolean giveLoanInput(int money) {
		if(money < BankBalance && bal < money) {
			BankBalance -= money;
			bal += money;
			System.out.println("Loan of " + money + " is Issued");
			System.out.println("Loan Issue Date and Time : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
			return true;
		}else {
			System.out.println("We apologise, Loan cannot be issued.");
			return false;
		}
	}
	
	
	public int updateDetailsInput(int pin, int pinn) {
		if(pin == 1234) {
			if(pinn == 1234) {
				System.out.println("old pin cannot be the new pin");
				return 0;
			}else {
				System.out.println("Pin changed");
				return 1;
			}
		}else {
			System.out.println("Incorrect pin. Update failed.");
			return 0;
		}
	}
	
	public int collectMoneyInput(int money) {
		if(money <= bal) {
			System.out.println("The amount can be collected");
			bal -= money;
			System.out.println("your account balance is: " + bal);
			return bal;
		}else {
			System.out.println("You dont have enough balance.");
			return -1;
		}
	}
	
	public boolean transactionInput(int acn, int money, int pin) {
		if(money > bal) {
			System.out.println("Not enough funds for transaction");
			System.out.println("Transaction Failed");
			return false;
		}
		if(pin==1234) {
			System.out.println("Transaction Successful");
			bal -= money;
			System.out.println("Account balance now is " + bal);
			return true;
		}else {
			System.out.println("Incorrect pin");
			System.out.println("Transaction Failed");
			return false;
		}
	}


}
