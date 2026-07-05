package whileLoop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int num=sc.nextInt();
		int org=num;
		int temp=num;
		int sum=0;
		int count=0;
		//count digits
		while(temp!=0) {
			temp/=10;
			count++;	
		}
		temp=num;
		while(temp!=0)
		{
			int digit=temp%10;
			sum+=(int)Math.pow(digit, count);
			temp/=10;
			}
		if(org==sum) {
			System.out.println("amstrong number");
		}
		else {
			System.out.println("not a armstrong");
		}
		}

}
