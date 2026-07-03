package basics_01;
import java.util.Scanner;
public class CompoundIcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//A=p*[1+rate/100]^n
		double rate;
		double principal;
		double amount;
		int n;
		System.out.println("enter the principal amaount:");
		principal=  sc.nextDouble();
		System.out.println("enter the rate:");
		rate=  sc.nextDouble();
		System.out.println("enter the times amount:");
		n=  sc.nextInt();
		amount=principal*Math.pow(1+rate/100,n);
		System.out.printf("the compunt intrest total amount is %.2f",amount);
		sc.close();

	}

}
