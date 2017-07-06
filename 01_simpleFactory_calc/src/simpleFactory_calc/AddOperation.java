package simpleFactory_calc;

public class AddOperation extends Operation {

	@Override
	public double getResult() {
		return this.getNumA() + this.getNumB();
	}
	
	public double getResult(int t) {
		int i = 0;
		return this.getNumA() - this.getNumB();
	}

}
