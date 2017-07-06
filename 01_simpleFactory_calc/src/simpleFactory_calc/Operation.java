package simpleFactory_calc;

public abstract class Operation {
	private double numA;
	private double numB;

	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}

	public abstract double getResult();

}
