package Exerices;

public class Num1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("printing number from 1 to 100");
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			
		}
		//printing even only
		System.out.println("printing only even from 1to 100");
		for(int j=1;j<=100;j++) {
			if(j%2==0) {
				System.out.println(j);
			}
		}
		//printing odd only
				System.out.println("printing only odd from 1to 100");
				for(int j=1;j<=100;j++) {
					if(j%2==1) {
						System.out.println(j);
					}
				}
	}

}
