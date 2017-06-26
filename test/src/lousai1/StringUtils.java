package lousai1;

public class StringUtils {
	public static boolean allIsNotNull(String... s) {
		if(s.length < 1) {
			return false;
		}
		
		for (String s1 : s) {
			if(s1 == null) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean allIsNotEmpty(String... s) {
		if(s == null && s.length < 1) {
			return false;
		}
		
		System.out.println(s);
		
		for (String s1 : s) {
			if(s1 == null || s1.equals("")) {
				return false;
			}
		}
		
		return true;
	} 
	
	public static void main(String[] args) {
		System.err.println(StringUtils.allIsNotEmpty("dfg", "null", "12", new String("1"), "s"));
		System.err.println(StringUtils.allIsNotEmpty());
	}
}
