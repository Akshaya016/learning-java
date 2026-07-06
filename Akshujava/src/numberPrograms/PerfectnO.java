package numberPrograms;
import java.util.Scanner;
public class PerfectnO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<num) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
	
		
		if(sum==num) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
	}}
