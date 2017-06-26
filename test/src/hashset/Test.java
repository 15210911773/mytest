package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		boolean add = set.add("hello");
		System.err.println(add);
		boolean add2 = set.add("world");
		System.err.println(add2);
		boolean add3 = set.add("hello");
		System.err.println(add3);
		boolean remove = set.remove("1");
		System.err.println(remove);
		boolean remove2 = set.remove("hello");
		System.err.println(remove2);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.err.println(next);
		}
	}
	
}
