package sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 4, 2, 3, 10, 2, 3, 5, 8, 9};
		sort(arr, 0, arr.length - 1);
		print(arr);
	}

	public static void sort(int[] arr, int left, int right) {
		int mid = left + (right - left) / 2;
		if (left == right) {
			return;
		}
		sort(arr, left, mid);
		sort(arr, mid + 1, right);
		mergeSort(arr, left, mid, right);
	}

	public static void mergeSort(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int i = left;
		int k = 0;
		int j = mid + 1;

		while (i <= mid && j <= right) {
			temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
		}
		while (i <= mid)
			temp[k++] = arr[i++];
		while (j <= right)
			temp[k++] = arr[j++];
		for (int m = 0; m < temp.length; m++)
			arr[left + m] = temp[m];
	}

	public static void print(int[] list) {
		for (Object num : list) {
			System.out.print(num + " ");
		}
	}
}
