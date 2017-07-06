package simpleFactory_calc;

public class AddOperation extends Operation {

	@Override
	public double getResult() {
		String s = "I like ´ó¹ÃÄï£¡";
		return this.getNumA();
	}
	
	public double getResult(int t) {
		int i = 0;
		return this.getNumA() - this.getNumB();
	}

}
