package sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = new int[]{49, 45, 89, 12, 56, 23, 46};
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void quickSort(int[] arr, int left, int right) {
		int low = left;
		int high = right;
		if (low > high) return;
		int plot = arr[low];
		while (low < high) {
			while (low < high && arr[high] >= plot)
				-- high;
			arr[low] = arr[high];
			while (low < high && arr[low] <= plot)
				++ low;
			arr[high] = arr[low];
		}
		arr[low] = plot;
		quickSort(arr, left, low-1);
		quickSort(arr, low+1, right);
	}
}