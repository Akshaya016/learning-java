package array;
import java.util.Scanner;
public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]num;
		int size;
		int sum=0;
		System.out.println("enter how nunmber to print");
		size=sc.nextInt();
		num=new int[size];
		System.out.printf("enter the %d numbers:",size);
        for(int i=0;i<num.length;i++) {
        	num[i]=sc.nextInt();
        	sum+=num[i];
        }
        System.out.println("the total sum is:"+sum);
        sc.close();
	}


}
