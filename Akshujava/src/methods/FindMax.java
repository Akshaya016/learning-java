package methods;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	System.out.println("enter a and b");
	int a=sc.nextInt();
	int b= sc.nextInt();
		int max=findMax(a,b);
		
		System.out.println(max+"is greater");}

	
 static int findMax(int a,int b) {
	 if(a>b) {
		 return a;
	 }
	 else {
		 return b;
	 }
 }
}
