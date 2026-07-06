package numberPrograms;
import java.util.Scanner;
public class PrimenoOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int fact=0;
int i=1;
while(i<=num) {
	if(num%i==0) {
		fact++;
	
	}i++;
}if(fact==2) {
	System.out.println("prime");
}
else {
	System.out.println("not a prime");
}
	}

}
