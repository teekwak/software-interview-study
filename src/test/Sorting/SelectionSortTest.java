import org.junit.*;
import main.Sorting.SelectionSort;

public class SelectionSortTest {
	@Test
	public void canCreateInstance() {
		SelectionSort obj = new SelectionSort();
		Assert.assertTrue(true);
	}

	@Test
	public void sortingEmptyArrayReturnsEmptyArray() {
		SelectionSort obj = new SelectionSort();
		int[] input = new int[0];
		obj.sort(input);

		Assert.assertArrayEquals(new int[0], input);
	}

	@Test
	public void canSwapTwoNumbersInArray() {
		SelectionSort obj = new SelectionSort();
		int[] input = new int[] {1, 2};
		obj.swap(input, 0, 1);

		Assert.assertArrayEquals(new int[] {2, 1}, input);
	}

	@Test
	public void arrayShouldBeSorted() {
		SelectionSort obj = new SelectionSort();
		int[] input = new int[] {1, 9, 3, 5, 8, 2, 7, 10, 4, 6};
		obj.sort(input);

		Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, input);
	}
}
