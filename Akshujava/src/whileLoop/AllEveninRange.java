package whileLoop;

public class AllEveninRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=1;
		while(i<=50) {
			if(i%2==0) {
				System.out.println(i);	
			}i++;
		}
		//odd
		while(j<=50) {
			if(j%2==1) {
				System.out.println(j);
			}j++;
		}

	}

}
