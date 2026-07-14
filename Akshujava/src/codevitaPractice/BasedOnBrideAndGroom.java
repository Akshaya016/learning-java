package codevitaPractice;
import java.util.*;
public class BasedOnBrideAndGroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("enter no of pairs");
		        int n = sc.nextInt();
		        System.out.println("");
		        String brides = sc.next();
		        String grooms = sc.next();

		        Queue<Character> groomQueue = new LinkedList<>();

		        // Add all grooms to queue
		        for (int i = 0; i < n; i++) {
		            groomQueue.offer(grooms.charAt(i));
		        }

		        int brideIndex = 0;

		        while (brideIndex < n) {

		            char bride = brides.charAt(brideIndex);
		            int size = groomQueue.size();
		            boolean matched = false;

		            // Bride checks every remaining groom once
		            for (int i = 0; i < size; i++) {

		                char groom = groomQueue.peek();

		                if (bride == groom) {
		                    groomQueue.poll();      // Remove groom
		                    brideIndex++;           // Bride gets married
		                    matched = true;
		                    break;
		                } else {
		                    groomQueue.poll();      // Remove from front
		                    groomQueue.offer(groom); // Add to back
		                }
		            }

		            // Bride couldn't find a matching groom
		            if (!matched) {
		                break;
		            }
		        }

		        // Remaining brides are unmatched
		        System.out.println(n - brideIndex);

		        sc.close();
		    }
		

	}


