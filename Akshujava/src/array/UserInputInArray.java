package array;
import java.util.Scanner;
public class UserInputInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[]fruits=new String[3];
		for(int i=0;i<fruits.length;i++) {
			System.out.println("enter the names:");
			fruits[i]=sc.nextLine();
		}
		for(String food:fruits) {
			System.out.println(food);
		}
sc.close();
	}

}
