package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] Arr = { 2, 34, 65, 12, 89, 43, 90, 434 };
		int res[] = selectSort(Arr);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

	public static int[] selectSort(int[] Arr) {
		int[] myArr = Arr;

		for (int i = 0; i < myArr.length; i++) {
			int min = i;
			for (int j = i + 1; j < myArr.length; j++) {
				if (myArr[j] < myArr[min]) {
					min = j;
				}
			}
			int temp = myArr[i];
			myArr[i] = myArr[min];
			myArr[min] = temp;
		}
		return myArr;

	}

}
