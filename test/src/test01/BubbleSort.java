package test01;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	
	public static void bubbleSort(int[] nums) {
		int n = nums.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(nums[j] < nums[j+1]) {
					swap(nums, j, j + 1);
				}
			}
		}
	}
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
	
		int[] nums = new int[20];
		int i = 0;
		while(i < nums.length) {
			nums[i] = rand.nextInt(50);
			i++;
		}
		
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
}
