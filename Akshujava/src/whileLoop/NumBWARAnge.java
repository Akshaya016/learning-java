package whileLoop;
import java.util.Scanner;
public class NumBWARAnge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
	 int num=sc.nextInt();
if(num>=10&&num<=50) {
	System.out.println("its in a range 10-50");
}
else {
	System.out.println("not in a range");
}
sc.close();
	}

}
