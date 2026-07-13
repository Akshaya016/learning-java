package array;
import java.util.Scanner;
public class LArgestOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]num;
		int size;
		System.out.println("enter how nunmber to print");
		size=sc.nextInt();
		num=new int[size];
int max=num[0];
		System.out.printf("enter the %d numbers:",size);
        for(int i=0;i<num.length;i++) {
        	num[i]=sc.nextInt();
        	if(num[i]>max)
        	{
        		max=num[i];
        	}
        }
        System.out.println("the largest number is:"+max);
		
		
		sc.close();
	}

}
