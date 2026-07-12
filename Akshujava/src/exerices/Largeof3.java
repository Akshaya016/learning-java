package exerices;
import java.util.Scanner;
public class Largeof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number 1:");
		int num1=sc.nextInt();
		System.out.println("enter a number 2:");
		int num2=sc.nextInt();
		System.out.println("enter a number 3:");
		int num3=sc.nextInt();
		if(num1>num2&&num1>num3) {
			System.out.println("num1 is large");
		}
		else if(num2>num1&&num2>num3){ 
			System.out.println("number 2 is large");
		}
		else {
			System.out.println("num3 is large");
		}


	}

}
