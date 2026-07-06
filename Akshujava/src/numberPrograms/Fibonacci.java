package numberPrograms;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int i=1;
		
		while(i<=num) {
			System.out.print(a+" ");
			 int c=a+b;
			 a=b;
			 b=c;
			i++;
			
		}
	
		

	}

}
