package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] Arr = { 21, 56, 32, 87, 33, 65, 78, 23 };
		int res[] = insertSort(Arr);
		printArray(res);
	}

	private static void printArray(int[] res) {
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

	public static int[] insertSort(int[] Arr) {
		int[] myArr = Arr;
		for (int i = 1; i < myArr.length; i++) {
			int element = myArr[i];
			int j = i - 1;
			while (j >= 0 && myArr[j] > element) {
				myArr[j + 1] = myArr[j];
				j--;
			}
			myArr[j + 1] = element;
		}
		return myArr;
	}

}
