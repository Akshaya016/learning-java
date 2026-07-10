package methods;

import java.util.Scanner;

public class ReverseUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        System.out.println("Reversed Number = " + reverse(num));
	}
	    static int reverse(int num) {
	        int rev = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            rev = rev * 10 + digit;
	            num = num / 10;
	        }

	        return rev;
	    }

	  
	}


