package numberPrograms;
import java.util.Scanner;
public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number:");
        int num=sc.nextInt();
        int org=num;
        int sum=0;
        while(num!=0){
           int dig=num%10;
          int fact=1;
          int i=1;
          while(i<=dig) {
        	  fact*=i;
        	  i++;
          }
          sum+=fact;
           num/=10;
          
            }
if(org==sum) {
	System.out.println("strong number");
}else {
	System.out.println("not a strong number");
}
	}

}
