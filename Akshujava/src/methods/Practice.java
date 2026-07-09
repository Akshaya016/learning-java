package methods;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=12;
if(agecheck(age)) {
	System.out.println("you are allowed");
}
else {
	System.out.println("you may not allowed");
}
	}
	static void happy(String name,int age) {
		System.out.println("happyy birthday ");
		System.out.printf("happyy birthday %s \n ",name);
		System.out.printf("happyy birthday %d years old \n ",age);
		System.out.println("happyy birthday ");
		System.out.println();
	}
static int square(int n) {
	return n*n;
}
static double cube(int n) {
	return n*n*n;
}
static boolean agecheck(int age) {
	 if(age>=18) {
		 return true;
	 }
	 else {
		 return false;
	 }
	
}
}

