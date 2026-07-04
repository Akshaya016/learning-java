package whileLoop;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int guess;
		int attempt=0;
		int min=1;
		int max=100;
		int raNo=rn.nextInt(min, max+1);
		System.out.println("NUMBER GUESSING GAME!");
		System.out.println("guess a number b/w (1-100)");
		do {
			System.out.println("enter a guess:");
			guess=sc.nextInt();
			attempt++;
			if(guess<raNo) {
				System.out.println("tooo lowwww");
			}
			else if(guess>raNo) {
				System.out.println("tooo high");
			}
			else {
				System.out.println("Hurayyy you won : "+raNo);
                System.out.println("the attempts you took:"+attempt);
			}
			
		}while(guess!=raNo);
		
		sc.close();
	}
	

}
