package array;

import java.util.Scanner;

public class QuizProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]ques= {
				"what is your name?",
					"you love what?",
					"what you like to eat"};
		String [][] option= {
				{"1.AKSHU","2.MAKSHU","3.BAKSHU"},
				{"1.DOGS","2.CATS","3.TIGER"},
				{"1.RICE","2.NOODLES","3.ALL THE ABOVE"}
		};
	int ans[]= {1,2,3};
		int guess;
		int score=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("-----------------------------");
	System.out.println("Welcome to the quiz program");
	System.out.println("-----------------------------");
	for(int i=0;i<ques.length;i++) {
		System.out.println(ques[i]);
		
	 for(String op:option[i]) {
		 System.out.println(op);}
		System.out.println("enter the guess:");
		guess=sc.nextInt();
		if(guess==ans[i]) {
			System.out.println("-------");
			System.out.println("CORRECT");
			System.out.println("-------");
			score++;
		}
		else {
			System.out.println("-------");
			System.out.println("WRONG");
			System.out.println("-------");
		}
	 
	 System.out.println("you are "+score+ " out of"+ques.length);
	}
		

	}

}
