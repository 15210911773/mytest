package split;

public class Test {

	public static void main(String[] args) {
		String s = "this is hello world!";
		String[] a = s.split("\\s");
		int i = 0;
		for (String string : a) {
			System.err.println( ++i + " : " + string);
		}
		
		int a1 = Integer.MAX_VALUE;
		
		int[] arr = new int[a1 - 1];
	}
	
}
