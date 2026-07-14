package array;

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(add(1,2,2,4,5,56,6,67));

	}
    static int add(int ... num) {
    	int sum=0;
    	for(int nums:num) {
    		sum+=nums;
    		}
    return sum;
    }
    
}
