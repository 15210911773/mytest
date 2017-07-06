package simpleFactory_calc;

public class DivOperation extends Operation {

	@Override
	public double getResult() {
		if(getNumB() == 0) {
			try {
				throw new Exception("除数不能为0");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		return getNumA() / getNumB();
	}

}
