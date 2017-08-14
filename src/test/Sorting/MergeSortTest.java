import org.junit.*;
import org.hamcrest.*;
import main.Sorting.MergeSort;

public class MergeSortTest {
	@Test
	public void canInstantiateClass() {
		MergeSort obj = new MergeSort();
		MatcherAssert.assertThat(obj, CoreMatchers.instanceOf(MergeSort.class));
	}

	@Test
	public void sortingEmptyArrayReturnsEmptyArray() {
		MergeSort obj = new MergeSort();
		int[] input = new int[0];
		obj.sort(input);

		Assert.assertArrayEquals(new int[0], input);
	}

	@Test
	public void canSortOneNumber() {
		MergeSort obj = new MergeSort();
		int[] input = new int[] {1};
		obj.sort(input);

		Assert.assertArrayEquals(new int[] {1}, input);
	}

	@Test
	public void arrayShouldBeSorted() {
		MergeSort obj = new MergeSort();
		int[] input = new int[] {1, 9, 3, 5, 8, 2, 7, 10, 4, 6};
		obj.sort(input);

		Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, input);
	}
}