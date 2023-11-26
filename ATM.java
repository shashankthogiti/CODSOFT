package codsoft1;

import java.util.Scanner;

public class ATM {
	private BankAccount bankAccount;

	public ATM(double initialBalance) {
		this.bankAccount = new BankAccount(initialBalance);
	}

	public void runATM() {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			displayOptions();
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				performTransaction("deposit");
				break;
			case 3:
				performTransaction("withdraw");
				break;
			case 4:
				System.out.println("Exiting. Thank you for using!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice < 4);
	}

	private void displayOptions() {
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
	}

	private void checkBalance() {
		System.out.println("Current balance: " + bankAccount.getBalance());
	}

	private void performTransaction(String transactionType) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter " + transactionType + " amount: ");
		double amount = sc.nextDouble();

		if ("deposit".equals(transactionType)) {
			bankAccount.deposit(amount);
		} else if ("withdraw".equals(transactionType)) {
			bankAccount.withdraw(amount);
		}
	}

}
