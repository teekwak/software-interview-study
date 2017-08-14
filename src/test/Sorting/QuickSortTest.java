import org.junit.*;
import org.hamcrest.*;

import main.Sorting.QuickSort;

public class QuickSortTest {
	@Test
	public void canInstantiateClass() {
		QuickSort obj = new QuickSort();
		MatcherAssert.assertThat(obj, CoreMatchers.instanceOf(QuickSort.class));
	}

	@Test
	public void sortingEmptyArrayReturnsEmptyArray() {
		QuickSort obj = new QuickSort();
		int[] input = new int[0];
		obj.sort(input);

		Assert.assertArrayEquals(new int[0], input);
	}

	@Test
	public void canSortOneNumber() {
		QuickSort obj = new QuickSort();
		int[] input = new int[] {1};
		obj.sort(input);

		Assert.assertArrayEquals(new int[] {1}, input);
	}

	@Test
	public void arrayShouldBeSorted() {
		QuickSort obj = new QuickSort();
		int[] input = new int[] {1, 9, 3, 5, 8, 2, 7, 10, 4, 6};
		obj.sort(input);

		Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, input);
	}
}