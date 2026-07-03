package whileLoop;

import java.util.Scanner;

public class ExerCharIsVowel_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a character to check its a vowel or not:");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("its a vowel");
		}
		else {
			System.out.println("not a vowel");
		}

sc.close();
	}

}
