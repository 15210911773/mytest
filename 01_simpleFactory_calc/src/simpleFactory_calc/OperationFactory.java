package simpleFactory_calc;

public class OperationFactory {
	
	public Operation createOperation(String operation) {
		Operation oper = null;
		switch (operation) {
		case "+" :
			oper = new AddOperation();
			break;
		case "-" :
			oper =  new SubOperation();
			break;
		case "/" : 
			oper = new DivOperation();
			break;
		}
		return oper;
	}
	
}
