package search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] Arr = { 21, 56, 32, 87, 33, 65, 78, 23 };
		int res = linearSearch(Arr, 5699);
		System.out.println("Result= " + res);
	}

	public static int linearSearch(int[] Arr, int num) {
		int[] searchFromArray = Arr;
		for (int i = 0; i < searchFromArray.length; i++) {
			if (searchFromArray[i] == num) {
				return i;
			}
		}
		return -1;
	}

}
