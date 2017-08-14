import org.junit.*;
import org.hamcrest.*;
import main.Sorting.InsertionSort;

public class InsertionSortTest {
	@Test
	public void canInstantiateClass() {
		InsertionSort obj = new InsertionSort();
		MatcherAssert.assertThat(obj, CoreMatchers.instanceOf(InsertionSort.class));
	}

	@Test
	public void sortingEmptyArrayReturnsEmptyArray() {
		InsertionSort obj = new InsertionSort();
		int[] input = new int[0];
		obj.sort(input);

		Assert.assertArrayEquals(new int[0], input);
	}

	@Test
	public void canSwapTwoNumbersInArray() {
		InsertionSort obj = new InsertionSort();
		int[] input = new int[] {1, 2};
		obj.swap(input, 0, 1);

		Assert.assertArrayEquals(new int[] {2, 1}, input);
	}

	@Test
	public void canSortOneNumber() {
		InsertionSort obj = new InsertionSort();
		int[] input = new int[] {1};
		obj.sort(input);

		Assert.assertArrayEquals(new int[] {1}, input);
	}

	@Test
	public void arrayShouldBeSorted() {
		InsertionSort obj = new InsertionSort();
		int[] input = new int[] {1, 9, 3, 5, 8, 2, 7, 10, 4, 6};
		obj.sort(input);

		Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, input);
	}
}