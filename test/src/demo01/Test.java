package demo01;

public class Test {
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = new String("abcd");
		String s3 = "ab";
		String s4 = "cd";
		String s5 = "ab" + "cd";
		String s6 = s3 + s4;
		System.out.println(s1 == s2);
		System.out.println(s1 == s5);
		System.out.println(s1 == s6);
		System.out.println(s1 == s6.intern());
		System.out.println(s2 == s2.intern());
	}
}
