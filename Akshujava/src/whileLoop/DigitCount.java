package whileLoop;
import java.util.Scanner;
public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int num=sc.nextInt();
int count=0;
while(num!=0) {
	num/=10;
	count++;
}System.out.println("the count is : "+count);
	}

}
