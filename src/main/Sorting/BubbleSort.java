package main.Sorting;

public class BubbleSort {
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void sort(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length - i - 1; j++) {
				if(nums[j] > nums[j + 1]) {
					swap(nums, j, j + 1);
				}
			}
		}
	}
}
