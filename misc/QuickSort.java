package misc;


public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 2, 6, 1, 7, 9, 4, 10 };
		quicksortOptimized(data, 0, data.length - 1);
		for (int i : data) {
			System.out.println(i);
		}
	}


	public static void quicksortOptimized(int[] data, int left, int right) {
		int pivotValue = data[(left + right) / 2];
		int i = left;
		int j = right;
		while (i <= j) {
			// Find leftmost value greater than or equal to the pivot.
			while (data[i] < pivotValue)
				i++;
			// Find rightmost value less than or equal to the pivot.
			while (data[j] > pivotValue)
				j--;
			// If the values are in the wrong order, swap them.
			if (i <= j) {
				swap(data, i, j);
				i++;
				j--;
			}
		}
		// Apply the algorithm to the partitions we made, if any.
		if (left < j) {
			quicksortOptimized(data, left, j);
		}
		if (i < right) {
			quicksortOptimized(data, i, right);
		}
	}

	private static void swap(int[] data, int i, int j) {
		int temp;
		temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
