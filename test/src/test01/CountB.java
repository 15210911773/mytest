package test01;

public class CountB {

	private static Integer count = 0;

//	public static int countB(int n) {
//		if (n == 2 || n == 3) {
//			return 1;
//		}
//		return countB(n % 3 + n / 3) + n / 3;
//	}
	
	public static void countB(int n) {
		if(n == 2 || n == 3) {
			count++;
			return;
		}
		int newB = n / 3;
		count += newB;
		countB(n % 3 + newB);
	}

	public static void main(String[] args) {
		CountB.countB(10);
		String s = "abc";
		System.err.println("新瓶的数量： " + count);
	}

}
