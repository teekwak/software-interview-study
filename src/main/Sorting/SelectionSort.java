package main.Sorting;

public class SelectionSort {
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void sort(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			int min = i;
			for(int j = i; j < nums.length; j++) {
				if(nums[j] < nums[min]) {
					min = j;
				}
			}
			swap(nums, i, min);
		}
	}
}
