package sorting;

public class MergeSort {

	public void sort(int[] Arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = (start + end) / 2;
		sort(Arr, start, mid);
		sort(Arr, mid + 1, end);
		merge(Arr, start, mid, end);

	}

	private void merge(int[] inputArray, int start, int mid, int end) {
		int[] tempArray = new int[end - start + 1];
		int leftSlotIndex = start;
		int rightSlotIndex = mid + 1;
		int k = 0;

		while (leftSlotIndex <= mid && rightSlotIndex <= end) {
			if (inputArray[leftSlotIndex] < inputArray[rightSlotIndex]) {
				tempArray[k] = inputArray[leftSlotIndex];
				leftSlotIndex++;
			} else {
				tempArray[k] = inputArray[rightSlotIndex];
				rightSlotIndex++;
			}
			k++;
		}
		// if all values in right were added to temp array but some left array vals
		// still remailn
		// it means that the left array is sorted already
		// we directly add these vals from L array to temp

		if (leftSlotIndex <= mid) {
			while (leftSlotIndex <= mid) {
				tempArray[k] = inputArray[leftSlotIndex];
				leftSlotIndex++;
				k++;
			}
		} else if (rightSlotIndex <= end) {
			while (rightSlotIndex <= end) {
				tempArray[k] = inputArray[rightSlotIndex];
				rightSlotIndex++;
				k++;
			}

		}
		// copy the tempArray to input array

		for (int i = 0; i < tempArray.length; i++) {
			inputArray[start + i] = tempArray[i];
		}
	}
}
