package simpleFactory_calc;

import java.util.Scanner;

public class Cosole {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nextLine = null;
		while(in.hasNext()) {
			System.err.println("请输入运算符吧:");
			nextLine = in.nextLine();
			if(nextLine.equals("\\")) {
				break;
			}
			OperationFactory factory = new OperationFactory();
			Operation operation = factory.createOperation(nextLine);
			System.err.println("请输入第一个数字:");
			operation.setNumA(in.nextDouble());
			System.err.println("请输入第二个数字:");
			operation.setNumB(in.nextDouble());
			
			try {
				System.err.println("结果为:" + operation.getResult());
			} catch (Exception e) {
				try {
					throw new Exception("没有对应的运算符!");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} 
			
			
		}
	}
	
}
