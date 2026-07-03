package basics_01;
import java.util.Scanner;
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the email");
	String email=sc.nextLine();
	String username=email.substring(0,email.indexOf("@"));
	String domain =email.substring(email.indexOf("@")+1);
	System.out.println(username);
	System.out.println(domain);
	}

}
