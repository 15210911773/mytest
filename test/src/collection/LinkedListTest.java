package collection;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<>();
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list.get(1));
	}
}
