package sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	private Random rand = new Random();
	
	public int partition(int[] nums, int i, int j) {
		int center = rand.nextInt(j - i + 1) + i;
		//将被选中的元素放在末尾索引处
		swap(nums, center, j);
		int val = nums[j];
		
		int m = i, n = j - 1;
		while(m <= n) {
			if(nums[m] >= val && nums[n] < val) {
				swap(nums, m, n);
			}
			if(nums[m] < val) {
				m++;
			}
			if(nums[n] >= val) {
				n--;
			}
		}
		
		//将被选中的元素放入正确的位置
		swap(nums, m, j);
		
		return m;
	}
	
	public void quickSort(int[] nums, int i, int j) {
		if(i == 0 && j == nums.length - 1) {
			System.err.println("快速排序开始啦:");
		}
		if(nums == null || nums.length == 0) {
			return ;
		}
		//递归终止条件
		if(i < j) {
			int index = partition(nums, i, j);
			quickSort(nums, i, index - 1);
			quickSort(nums, index + 1, j);
		}
	}
	
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] nums = new int[1000];
		int i = 0;
		while(i < nums.length) {
			nums[i] = rand.nextInt(3000);
			i++;
		}
		
		new QuickSort().quickSort(nums, 0, nums.length - 1);
		System.err.println(Arrays.toString(nums));
		
		for(int j = 0; j < nums.length - 1; j++) {
			if(nums[j] > nums[j+1]) {
				System.err.println(false);
				break;
			}
			if(j == nums.length - 2) {
				System.err.println(true);
			}
		}
	}
	

}
