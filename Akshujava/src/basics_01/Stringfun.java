package basics_01;

public class Stringfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w ="love you";
		int len=w.length();
		System.out.println(len);
	    char ch=w.charAt(6);
		System.out.println(ch);
		int ind=w.indexOf("y");
		System.out.println(ind);
		int lastind=w.lastIndexOf("o");
		System.out.println(lastind);
		w=w.toLowerCase();
		System.out.println(w);
		w=w.toUpperCase();
		System.out.println(w);
		
		System.out.println(w.replace("O", "E"));
	
	}

}
