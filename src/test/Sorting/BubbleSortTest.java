import org.junit.*;
import main.Sorting.BubbleSort;

public class BubbleSortTest {
	@Test
	public void sortingEmptyArrayReturnsEmptyArray() {
		BubbleSort obj = new BubbleSort();
		int[] input = new int[0];
		obj.sort(input);

		Assert.assertArrayEquals(new int[0], input);
	}

	@Test
	public void arrayShouldBeSorted() {
		BubbleSort obj = new BubbleSort();
		int[] input = new int[] {1, 9, 3, 5, 8, 2, 7, 10, 4, 6};
		obj.sort(input);

		Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, input);
	}
}