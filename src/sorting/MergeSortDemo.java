package sorting;

public class MergeSortDemo {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 5, 3, 9, 1, 6, 3, 7, 9, 4 };
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, 11);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
