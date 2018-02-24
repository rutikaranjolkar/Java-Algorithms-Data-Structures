package search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] Arr = { 21, 56, 32, 87, 33, 65, 78, 23 };
		int res = binSearch(Arr, 8744);
		System.out.println("Result= " + res);
	}

	public static int binSearch(int[] Arr, int num) {
		int[] searchFromArray = Arr;
		int p = 0;
		int r = searchFromArray.length - 1;
		while (p <= r) {
			int q = (p + r) / 2;
			if (searchFromArray[q] == num) {
				return q;
			} else {
				if (num < searchFromArray[q]) {
					r = q - 1;
				} else {
					p = q + 1;
				}
			}
		}

		return -1;
	}

}
