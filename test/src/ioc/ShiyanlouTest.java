package ioc;

public class ShiyanlouTest implements Shiyanlou {

	@Override
	public String toUp(String name) {
		System.err.println("ǰ����ǿ...");
		name = s.toUp(name);
		System.err.println(name);
		System.err.println("������ǿ...");
		return null;
	}

	private Shiyanlou s;

	public void setS(Shiyanlou s) {
		this.s = s;
	}

}
