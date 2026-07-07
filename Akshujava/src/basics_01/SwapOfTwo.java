package basics_01;
import java.util.Scanner;
public class SwapOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the values of A and B:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before Swapping A :"+a+"And B:"+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("after swapping of A:"+a+" "+"and B :"+b);
	}

}
