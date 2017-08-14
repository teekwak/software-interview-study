package main.Sorting;

import java.util.Arrays;

public class MergeSort {
	public void merge(int[] nums, int low, int mid, int high) {
		int[] L = Arrays.copyOfRange(nums, low, mid + 1);
		int[] R = Arrays.copyOfRange(nums, mid + 1, high + 1);

		int i = 0, j = 0, k = low;

		while(i < L.length && j < R.length) {
			if(L[i] < R[j]) {
				nums[k] = L[i];
				k++;
				i++;
			} else {
				nums[k] = R[j];
				j++;
				k++;
			}
		}

		while(i < L.length) {
			nums[k] = L[i];
			i++;
			k++;
		}

		while(j < R.length) {
			nums[k] = R[j];
			j++;
			k++;
		}
	}

	public void sortHelper(int[] nums, int low, int high) {
		if(low < high) {
			int mid = (low + high) / 2;
			sortHelper(nums, low, mid);
			sortHelper(nums, mid + 1, high);
			merge(nums, low, mid, high);
		}
	}

	public void sort(int[] nums) {
		sortHelper(nums, 0, nums.length - 1);
	}
}