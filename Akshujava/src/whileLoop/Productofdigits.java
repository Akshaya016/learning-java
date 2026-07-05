package whileLoop;
import java.util.Scanner;
public class Productofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to calc the product of digit");
		int num=sc.nextInt();
		int product=1;
		while(num!=0) {
			int digit=num%10;
			product*=digit;
			num/=10;
		}System.out.println("the sum of the digit is:"+product);
		
	}

}
