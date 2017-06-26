package test01;

public class Lower extends Upper {

	private String lowerStr;

	public String getLowerStr() {
		return lowerStr;
	}

	public void setLowerStr(String lowerStr) {
		this.lowerStr = lowerStr;
	}

	public Lower() {
		super();
	}

	public static void main(String[] args) {
		new Lower();
	}

}
