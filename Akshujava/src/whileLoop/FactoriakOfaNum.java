package whileLoop;
import java.util.Scanner;
public class FactoriakOfaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   while (true) {
	            System.out.print("Enter a number: ");
	            int n = sc.nextInt();


	            int fact = 1;
	            int i = 1;

	            while (i <= n) {
	                fact = fact * i;
	                i++;
	            }

	            System.out.println("Factorial = " + fact);
	        }

	      
	}

}
