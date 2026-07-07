package forloop;

public class Counttown {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=5;i>0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("happy birthday");

	}

}
