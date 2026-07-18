package array;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bal=100;
		int bet;
		int payout;
		String[]row;
		System.out.println("***************");
		System.out.println("welcome to slot game");
		System.out.println("Symbols:😒|💖|😣|😍|💕");
		System.out.println("***************");
		while(bal>0) {
			System.out.println("current bal:"+bal);
			System.out.print("enter your bet amt:");
			bet=sc.nextInt();
			if(bet>bal) {
				System.out.println("Insufficient balance");
				continue;
			}
			else if(bet<=0) {
				System.out.println("must be non negative amt");
			  continue;
			}
			else {
				bal-=bet;
			}
			System.out.println("Spinning.......");
			row=spinrow();
			printrow(row);
			payout=getpayout(row,bet);
			
			if(payout>0) {
				System.out.println("you won $"+payout);
				bal+=payout;
			}
			else {
				System.out.println("you lost");
			}
			
			
			
		}
		
		sc.close();
	}
	static String[] spinrow() {
		String[]symbol= {"😒","💖","😣","😍","💕"};
		String[]row=new String[3];
		Random rn=new Random();
		for(int i=0;i<3;i++) {
			row[i]=symbol[rn.nextInt(symbol.length)];
		}
		
		return row;
	}
static void printrow(String[]row) {
	System.out.println("**********************");
	System.out.println(" "+String.join("|",row));
	System.out.println("**********************");
	
}
	static int getpayout(String[]row,int bet) {
		if (row[0].equals(row[1]) && row[1].equals(row[2])) {
		    return switch (row[0]) {
		        case "😒" -> bet * 3;
		        case "💖" -> bet * 4;
		        case "😣" -> bet * 5;
		        case "😍" -> bet * 10;
		        case "💕" -> bet * 20;
		        default -> 0;
		    };
		}
		
		else if (row[0].equals(row[1])) {
			    return switch (row[0]) {
			        case "😒" -> bet * 2;
			        case "💖" -> bet * 3;
			        case "😣" -> bet * 4;
			        case "😍" -> bet * 8;
			        case "💕" -> bet * 10;
			        default -> 0;
			    };
		}
		else if (row[1].equals(row[2])) {
		    return switch (row[1]) {
	        case "😒" -> bet * 2;
	        case "💖" -> bet * 3;
	        case "😣" -> bet * 4;
	        case "😍" -> bet * 8;
	        case "💕" -> bet * 10;
	        default -> 0;
	    };
		}
		
		return 0;
		
	}
	
	
	
}

