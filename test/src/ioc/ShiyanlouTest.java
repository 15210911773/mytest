package ioc;

public class ShiyanlouTest implements Shiyanlou {

	@Override
	public String toUp(String name) {
		System.err.println("前置增强...");
		name = s.toUp(name);
		System.err.println(name);
		System.err.println("后置增强...");
		return null;
	}

	private Shiyanlou s;

	public void setS(Shiyanlou s) {
		this.s = s;
	}

}
