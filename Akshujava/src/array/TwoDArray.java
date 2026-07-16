package array;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]abc= {{"a","b","c"},
				{"c","d","e"},
				{"f","g","h"}			
		};
		for(String[]ch:abc) {
			for(String c:ch) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		

	}

}
