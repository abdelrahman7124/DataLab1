public class HeapSort extends Sort{
    static void heapify(int arr[], int n, int i) {
        int largestPosition = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largestPosition]) {
            largestPosition = left;
        }
        if (right < n && arr[right] > arr[largestPosition]) {
            largestPosition = right;
        }
        if (largestPosition != i) {
            int temp = arr[i];
            arr[i] = arr[largestPosition];
            arr[largestPosition] = temp;

            heapify(arr, n, largestPosition);
        }
    }
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
            }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

}

