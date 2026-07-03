package Exerices;
import java.util.Scanner;
public class Largeoftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number 1:");
		int num1=sc.nextInt();
		System.out.println("enter a number 2:");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("num1 is large");
		}
		else {
			System.out.println("number 2 is large");
		}

	}

}
