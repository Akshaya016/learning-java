package ifelse;
import java.util.Scanner;
public class TwoDigitOrNot {

	public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
				System.out.print("enter a number to check:");
		        int num=sc.nextInt();
		        num=Math.abs(num);
		        if(num>=10 &&num <=99) {
		        	System.out.println("two digit");
		        }
		        else {
		        	System.out.println("not a two digit");
		        }
		        
	}

}
