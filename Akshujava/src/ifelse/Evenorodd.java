package ifelse;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		
		
		
		
		
		
		sc.close();
	}

}
