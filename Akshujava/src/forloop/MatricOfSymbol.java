package forloop;
import java.util.Scanner;
public class MatricOfSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of rows:");
		int r =sc.nextInt();
		System.out.println("enter no of column:");
		int c=sc.nextInt();
		System.out.println("enter a symbol:");
		char ch=sc.next().charAt(0);
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(ch);
			}System.out.println();
		}
		
		

	}

}
