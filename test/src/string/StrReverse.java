package string;

public class StrReverse {
	
	public void reverseStr(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		new StrReverse().reverseStr("hello");
	}
	
}
