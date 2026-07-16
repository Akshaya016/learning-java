package array;

public class DialPAd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]Dial= {
				{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'},
				{'*','0','#'}
			};
for(char[] no:Dial) {
	for(char n:no) {
		System.out.print(n+" ");
	}
	System.out.println();
}
	}

}
