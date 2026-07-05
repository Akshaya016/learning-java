package whileLoop;
import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number to calc the sum of digit");
int num=sc.nextInt();
int sum=0;
while(num!=0) {
	int digit=num%10;
	sum+=digit;
	num/=10;
}System.out.println("the sum of the digit is:"+sum);
	}

}
