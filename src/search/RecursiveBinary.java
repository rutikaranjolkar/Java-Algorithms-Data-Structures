package search;

public class RecursiveBinary {

	public static void main(String[] args) {
		int[] Arr = { 21, 23, 32, 65, 78, 283, 898, 1000 };
		int res = recBinary(Arr, 0, 7, 283000);
		System.out.println("Result= " + res);
	}

	public static int recBinary(int[] Arr, int p, int r, int num) {
		System.out.println("p...r" + p + " " + r);
		if (p > r) {
			return -1;
		} else {
			int q = (p + r) / 2;
			if (Arr[q] == num) {
				return q;
			} else if (Arr[q] > num) {
				return recBinary(Arr, p, q - 1, num);
			} else {
				return recBinary(Arr, q + 1, r, num);
			}
		}
	}

}
