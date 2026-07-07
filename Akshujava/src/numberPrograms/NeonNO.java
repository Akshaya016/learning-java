package numberPrograms;
import java.util.Scanner;
public class NeonNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();//9
		int sq=num*num;//81
		int org=num;
		int sum=0;
	while(sq!=0) {//81!=0
		int dig=sq%10;//1
		sum+=dig;//0=0+1=1
		sq/=10;//81/10=8
		
	}
	if(org==sum) {
		System.out.println("neon number");
	}
	else {
		System.out.println("not a neon number");
	}
		
sc.close();
	}

}
