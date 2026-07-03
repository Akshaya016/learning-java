package ifelse;

import java.util.Scanner;
public class PassorFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter marks: ");
		int marks = sc.nextInt();
		if(marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
        sc.close();
        
	}

}
