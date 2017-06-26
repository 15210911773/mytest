package duotai;

import java.sql.SQLException;

public class MyException<T extends Exception> {
	
	public void pleaseThrow(final Exception t) throws T {
		throw (T)t;
	}
	
	public static void main(String[] args) {
		try {
			new MyException<RuntimeException>().pleaseThrow(new SQLException());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally执行了");
		}
		
		System.out.println("程序执行完了...");
	}
	
}
