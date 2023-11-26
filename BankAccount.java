package codsoft1;

public class BankAccount {

	private double balance;

		public BankAccount(double initialBalance) {
			this.balance = initialBalance;
		}

		public double getBalance() {
			return balance;
		}

		public void deposit(double amount) {
			if (amount > 0) {
				balance = balance + amount;
				System.out.println("Deposit successful. \nNew balance : " + balance);
			} else {
				System.out.println("Invalid deposit amount.");
			}
		}

		public void withdraw(double amount) {
			if (amount > 0 && amount <= balance) {
				balance = balance - amount;
				System.out.println("Withdrawal successful.\nNew balance: " + balance);
			} else {
				System.out.println("Invalid withdrawal amount or insufficient funds.");
			}
		}
	}

