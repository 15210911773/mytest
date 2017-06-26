package cn.itcast.test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 1, arr2, 2, 4);
		
		System.err.println(Arrays.toString(arr2));
	}
}
