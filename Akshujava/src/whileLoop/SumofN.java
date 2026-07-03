package whileLoop;
import java.util.Scanner;
public class SumofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println("the sum is"+sum);
sc.close();
	}

}
