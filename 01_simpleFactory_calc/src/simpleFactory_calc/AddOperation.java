package simpleFactory_calc;

public class AddOperation extends Operation {

	@Override
	public double getResult() {
		return this.getNumA() + this.getNumB();
	}

}
