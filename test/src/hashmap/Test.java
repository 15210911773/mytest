package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		new ArrayList<>();
		new LinkedList<>();
		int[] i = new int[10];
		
		String val1 = map.put(null, "123");
		System.err.println("null键之前的值: " + val1);
		String val2 = map.put("456", "789");
		System.err.println("456之前的值: " + val2);
		String val4 = map.put("456", "9872");
		System.err.println(val4);
		map.put("654", "987");
		String val3 = map.put(null, "567");
		System.err.println(val3);
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
		}
	}
	
}
