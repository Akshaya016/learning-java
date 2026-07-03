package basics_01;

public class swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with temp var
		int a=10;
		int b=20;
		int temp;
	     temp=a;
	     a=b;
	     b=temp;
		System.out.println("a"+a);
		System.out.println("b"+b);
		//without temp
		int c=10;
		int d=20;
	c=c*d;
	d=c/d;
	c=c/d;
	System.out.println(c);
	System.out.println(d);
		

	}

}
