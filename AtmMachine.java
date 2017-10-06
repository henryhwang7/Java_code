package java_practice;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

class Bank {
	private int balance;
	
	public void deposit (int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if (balance < amount)
			System.out.println("Error! You have less than "+amount);
		else
			balance -= amount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int b) {
		balance = b;
	}
}

public class AtmMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		b.setBalance(10000);
		NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Current Balance: "+fmt.format(b.getBalance()));
		System.out.print("Amount to deposit (in USD): ");
		int d = sc.nextInt();
		b.deposit(d);
		System.out.println("Your balance after deposit: "+fmt.format(b.getBalance()));
		
		System.out.print("Amount to withdraw (in USD): ");
		int w = sc.nextInt();
		b.withdraw(w);
		System.out.println("Your balance after withdraw: "+fmt.format(b.getBalance()));
		sc.close();
	}
}
