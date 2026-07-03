package whileLoop;
import java.util.Scanner;
public class Logicalopp {
//&&-AND
	//OR-||
	//!NOT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username");
		String username=sc.nextLine();
		if(username.length()<4||username.length()>12){
			System.out.println("username must be 4-12 char");
		}else if(username.contains(" " )||username.contains("_")){
			System.out.println("must be no space and underscores");
		}
		else {
		System.out.println("hello "+username);
		}
		
		
		
	sc.close();
		

	}

}
