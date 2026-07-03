package basics_01;
import java.util.Scanner;
public class shoppingcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String item;
		double price;
	     int quantity;
		double total;
		//total=price*quantity;
		System.out.println("what you are like to order");
		item =sc.nextLine();
		System.out.println("how many :");
		quantity=sc.nextInt();
		System.out.println("the price of one:");
		price=sc.nextInt();
		total=price*quantity;
		System.out.println("your total is : $"+total);
		
		sc.close();
		

	}

}
