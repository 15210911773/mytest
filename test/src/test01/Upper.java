package test01;

public class Upper {

	private String upperStr;

	public String getUpperStr() {
		return upperStr;
	}

	public void setUpperStr(String upperStr) {
		this.upperStr = upperStr;
	}

	public Upper() {
		Init.init(this);
	}

}
