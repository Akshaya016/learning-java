package methods;
import java.util.Scanner;
public class FrequencyofString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to count:");
		String s= sc.nextLine();
		int[]arr=new int[256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int x=(int)ch;
			arr[x]++;
		}
		for(int i=0;i<256;i++) {

			if(arr[i]!=0) {
				System.out.println((char)i+"="+arr[i]);
			
			}
		}	
		sc.close();
		

	}
}
