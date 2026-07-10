package methodsoverload;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoNo=add(9,6);
		double doubleAdd=add(9.2,4.3);
		int threeadd=add(4,6,7);
		System.out.println(twoNo);
		System.out.println(doubleAdd);
		System.out.println(threeadd);

	}
	static int add(int a, int b) {
		return a+b;
		
	}
	 static double add(double a, double b) {
		 return a+b;
	 }
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}
