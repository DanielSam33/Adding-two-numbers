package Class_java;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int choice,balance=20000,amount;
		char ch;
		do {
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.print("Enter your choice: ");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				amount=s.nextInt();
				balance=balance-amount;
				System.out.println("Balance ="+balance);
				break;
			case 2:
				amount=s.nextInt();
				balance=balance+amount;
				System.out.println("Balance ="+balance);
				break;
			case 3:
				System.out.println("Balance ="+balance);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input");
			}
			System.out.print("Do you want to continue? y or n:");
			ch=s.next().charAt(0);
		}while(ch=='y'||ch=='y');
	}
}
