package Exerices;
import java.util.Scanner;
public class SumOfnNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number :");//153
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {//153>0
			int digit=num%10;//3
			sum+=digit;
			num=num/10;
			//121System.out.println(sum);
		}
		System.out.println(sum);

	}

}
