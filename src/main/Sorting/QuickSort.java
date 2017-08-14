package main.Sorting;

public class QuickSort {
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public int partition(int[] nums, int low, int high) {
		int pivot = nums[high];
		int wall = low - 1;

		for(int i = low; i < high; i++) {
			if(nums[i] <= pivot) {
				wall++;
				swap(nums, wall, i);
			}
		}

		swap(nums, wall + 1, high);
		return wall + 1;
	}

	public void sortHelper(int[] nums, int low, int high) {
		if(low < high) {
			int pi = partition(nums, low, high);
			sortHelper(nums, low, pi - 1);
			sortHelper(nums, pi + 1, high);
		}
	}

	public void sort(int[] nums) {
		sortHelper(nums, 0, nums.length - 1);
	}
}