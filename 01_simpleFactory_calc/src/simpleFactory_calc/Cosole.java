package simpleFactory_calc;

import java.util.Scanner;

public class Cosole {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nextLine = null;
		while(in.hasNext()) {
			System.err.println("�������������:");
			nextLine = in.nextLine();
			if(nextLine.equals("\\")) {
				break;
			}
			OperationFactory factory = new OperationFactory();
			Operation operation = factory.createOperation(nextLine);
			System.err.println("�������һ������:");
			operation.setNumA(in.nextDouble());
			System.err.println("������ڶ�������:");
			operation.setNumB(in.nextDouble());
			
			try {
				System.err.println("���Ϊ:" + operation.getResult());
			} catch (Exception e) {
				try {
					throw new Exception("û�ж�Ӧ�������!");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} 
			
			
		}
	}
	
}
