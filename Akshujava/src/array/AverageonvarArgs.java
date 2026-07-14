package array;

public class AverageonvarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(avg(2,3,4,5));
	}
static double avg(double ...num) {
	double sum=0;
	 for(double nums:num) {
		 sum+=nums;
	 }
	 return sum/num.length;
}
}
