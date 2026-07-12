package exerices;
import java.util.Scanner;
import java.util.Random;
public class DiceRollProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rc=new Random();
		System.out.println("enter no of times to roll:");
		int dice=sc.nextInt();
		int total=0;
        if(dice>0) {
        	for(int i=0;i<dice;i++) {
        		int roll=rc.nextInt(1,7);
        		System.out.println("you rolled "+roll);
        		printdie(roll);
        		total+=roll;
        	
        	}
        }
        else {
        	System.out.println("invalid number");
        }
        System.out.println("total no of roll: "+total);
	}
static void printdie(int roll) {
	String die1 ="""
			 ------
			 |     |
			 |  ●  |
			 |     |
			 -------
			""";
	String die2 ="""
			 ------
			 |●    |
			 |     |
			 |    ●|
			 -------
			""";
	String die3 ="""
			 ------
			 |●    |
			 |  ●  |
			 |    ●|
			 -------
			""";
	String die4 ="""
			 ------
			 |●   ●|
			 |     |
			 |●   ●|
			 -------
			""";
	String die5 ="""
			 ------
			 |●   ●|
			 |  ●  |
			 |●   ●|
			 -------
			""";
	String die6 ="""
			 ------
			 |●   ●|
			 |●   ●|
			 |●   ●|
			 -------
			""";
	switch(roll) {
	case 1-> System.out.print(die1);
	case 2-> System.out.print(die2);
	case 3-> System.out.print(die3);
	case 4-> System.out.print(die4);
	case 5-> System.out.print(die5);
	case 6-> System.out.print(die6);
	}
}
}
