package codevitaPractice;
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of r and m");
		int n=sc.nextInt();
		System.out.println("enter  r");
		String brides=sc.next();
		System.out.println("enter m");
		String grooms=sc.next();
		Queue<Character>groomQueue=new LinkedList<>();
		for(int i=0;i<n;i++) {
			groomQueue.offer(grooms.charAt(i));
		}
 int brideindex=0;
  while(brideindex<n) {
	  char bridechar=brides.charAt(brideindex);
	  int size= groomQueue.size();
	  boolean match=false;
	  
	 
  }
		
		

	}

}
