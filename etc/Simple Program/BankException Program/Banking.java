package BankSystem;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Account MyAccount = new Account();
		while(true) {
			System.out.println("Do you want to open an account,deposit,or withdraw?");
			System.out.println("\nEnter O for open an account, D for deposit, W for withdraw");
		
		
			Scanner sc=new Scanner(System.in);
			char userInput=sc.nextLine().charAt(0);
			
			if(userInput=='O' || userInput=='o') {
				MyAccount=new Account();
				System.out.println("Enter the initial deposit for your new account: ");
			
				try {
					MyAccount.setMoney(Double.parseDouble(sc.nextLine()));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				System.out.println("Your account balance : "+MyAccount.getMoney());
			}else if(userInput=='D' || userInput=='d') {
				System.out.println("Enter the amount to deposit");
				while(true) {
					try {
						MyAccount.Deposit(Double.parseDouble(sc.nextLine()));
						break;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
						System.out.println("Enter a positive number");
					}
				}
				System.out.println("Your account balance : "+MyAccount.getMoney());
			}else if(userInput=='W' || userInput=='w') {
				System.out.println("Enter the amount to withdraw:");
				try {
					MyAccount.Withdraw(Double.parseDouble(sc.nextLine()));
				}catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Not enough money");
					System.out.println(e.getMessage());
				}
				System.out.println("Your account balance : "+MyAccount.getMoney());
			}else {
				System.out.println("Invalid selection");
			}
			
			while(true) {
				System.out.println("Do you want more banking? answer Y to continue, N to exit");
				userInput=sc.nextLine().charAt(0);
				
				if(userInput=='Y' || userInput=='y') {
					break;
				}else if(userInput=='N' || userInput=='n') {
					System.out.println("\nProcess completed");
					System.exit(1);
				}else {
					System.out.println("Invalid selection");
				}
			
			}
		}
		
	}
	
}
