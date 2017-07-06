package simpleFactory_calc;

public class SubOperation extends Operation {

	@Override
	public double getResult() {
		return this.getNumA() - this.getNumB();
	}

}
