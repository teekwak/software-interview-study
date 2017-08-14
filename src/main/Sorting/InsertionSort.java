package main.Sorting;

public class InsertionSort {
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void sort(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			int j = i;
			while(j > 0 && nums[j] < nums[j - 1]) {
				swap(nums, j, j - 1);
				j--;
			}
		}
	}
}