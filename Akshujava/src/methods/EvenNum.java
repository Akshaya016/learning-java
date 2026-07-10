package methods;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enterr a number");
		int num=sc.nextInt();
		isEven(num);
		

	}
static void isEven(int num) {
	if(num%2==0) {
		System.out.println("even");
		
	}else {
		System.out.println("odd");
	}
}
}
