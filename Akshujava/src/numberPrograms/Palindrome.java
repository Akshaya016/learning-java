package numberPrograms;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
int num=sc.nextInt();
int orgnum=num;
int rev=0;//121
while(num!=0) {
	int digit=num%10;
	 rev=rev*10+digit;
	num/=10;
}
if(orgnum==rev) {
	System.out.println("its pali");
}
else {
	System.out.println("itsnot palindrome");}
}

}
