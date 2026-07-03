package ifelse;
import java.util.Scanner;
public class vowelorcons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a letter");
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	System.out.println("vowel");
	
}else {
	System.out.println("constant");
}
	}

}
