package array;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		String []ch= {"rock","paper","scissor"};
		String Pch;
		String Cch;
		String playAgain="yes";
		do {
		System.out.println("Enter your choice(Rock,Paper,Scissor)");
		Pch=sc.nextLine().toLowerCase();
		
		
		if(!Pch.equals("rock")&&!Pch.equals("paper")
					&&!Pch.equals("scissor")) {
				System.out.println("invalid choice");
	continue;
			}
		Cch=ch[rn.nextInt(3)];
		System.out.println("Computer's choice:"+Cch);
		
	if(Pch.equals(Cch)) {
		System.out.println("It's A Tie");
		
	}
	else if((Pch.equals("rock")&&Cch.equals("scissor"))||(Pch.equals("paper")&&Cch.equals("rock"))||
	(Pch.equals("scissor")&&Cch.equals("paper"))){
		
	System.out.println("You Win!");	
	}
	else {
		System.out.println("You Lose");
	}
	System.out.println("wanna play again!(yes/No)");
	playAgain=sc.nextLine().toLowerCase();
 
		
	}while(playAgain.equals("yes"));
		
		System.out.println("see you Again!");
	
	sc.close();
	}

}
