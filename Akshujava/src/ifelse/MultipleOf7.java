package ifelse;
import java.util.Scanner;
public class MultipleOf7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number to check:");
        int num=sc.nextInt();
        if(num%7==0) {
        	System.out.println("multiple of 7");
        }
        else {
        	System.out.println("not a multiple");
        }
        
	}

}
