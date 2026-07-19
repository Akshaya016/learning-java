package methods;

import java.util.Scanner;

public class StringFrequency {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        String str = sc.next();

		        for (int i = 0; i < str.length(); i++) {

		            char ch = str.charAt(i);
		            int count = 0;
		            boolean visited = false;

		            for (int j = 0; j < i; j++) {
		                if (str.charAt(j) == ch) {
		                    visited = true;
		                    break;
		                }
		            }

		            if (visited)
		                continue;
		            for (int j = 0; j < str.length(); j++) {
		                if (str.charAt(j) == ch) {
		                    count++;
		                }
		            }

		            System.out.println(ch + " = " + count);
		        }
		    }
		

	}


