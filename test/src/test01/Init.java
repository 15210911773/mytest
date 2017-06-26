package test01;

public class Init {
	
	public static void init(final Upper upper) {
		upper.setUpperStr("upper");
		if(upper instanceof Lower) {
			Lower lower = (Lower)upper;
			lower.setLowerStr("lower");
			System.out.println(lower.getUpperStr());
			System.out.println(lower.getLowerStr());
		}
	}
	
}
