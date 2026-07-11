package methods;
import java.util.Scanner;
public class BankTransaction {
static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=0;
		boolean running=true;
		int ch;
		while(running) {
			System.out.println("************");
			System.out.println("BANKING PROGRAM");
			System.out.println("************");
			System.out.println("1.deposit");
			System.out.println("2.withdraw");
			System.out.println("3.balance");
			System.out.println("4.exit");
			System.out.println("************");
			System.out.println("enter a option (1-4):");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1 -> balance+=deposit();
			case 2 ->balance-=withdraw(balance);
			case 3 -> showbalance(balance);
			case 4 -> running =false;
		}
		System.out.println("thank you");
		}

	}
	static void showbalance( double balance) {
		System.out.printf("%.2f",balance);
	}
	static double deposit() {
		System.out.println("enter a amount to be deposited");
		double amt=sc.nextDouble();
		if(amt<0) {
			System.out.println("cant be negative");
			return 0;
		}
		else {
			return amt;
		}
		
		
	}
	static double withdraw( double balance) {
		System.out.println("enter amount to be withdraw");
		double amt=sc.nextDouble();
		if(amt>balance) {
			System.out.println("insufficient balance");
			return 0;
		}
		else if(amt<0) {
			System.out.println("cant be negative");
			return 0;
		}
		else {
			return amt;
		}
		
	}
}
