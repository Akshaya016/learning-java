package basics_01;
import java.util.Random;
public class Randomnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int num=ran.nextInt(1,7);
		System.out.println(num);
		boolean bool=ran.nextBoolean();
		System.out.println(bool);
		double num1=ran.nextDouble(.25,.34);
		System.out.println(num1);

}
	}
