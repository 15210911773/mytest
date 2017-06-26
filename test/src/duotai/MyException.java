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
			System.out.println("finallyִ����");
		}
		
		System.out.println("����ִ������...");
	}
	
}
