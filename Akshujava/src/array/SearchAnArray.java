package array;
import java.util.Scanner;
public class SearchAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int[]num;
         int target;
         int size;
         boolean isfound=false;
         System.out.println("enter the size");
         size=sc.nextInt();
         num=new int[size];
         System.out.println("enter the target value");
         target=sc.nextInt();
         System.out.println("enter the numbers");
         for(int j=0;j<num.length;j++) {
        	 num[j]=sc.nextInt();
         }
         
         for(int i=0;i<num.length;i++) {
        	 if(target==num[i]) {
        		 System.out.println("element found at index:"+i);
        	     isfound=true;
        	     break;
        	 }
         }
        if(!isfound) {
        	System.out.println("no elemnts in an array");
        }
	}

}
