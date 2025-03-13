public class HybridSort {

    public void sort(int[] x, int THRESHOLD) {
        if (x.length <= 1) {
            return;
        }
        sort(x, 0, x.length - 1, THRESHOLD);
    }

    private static void sort(int[] x, int start, int end, int THRESHOLD) {
        if (start < end) {
            if (end - start + 1 > THRESHOLD) {
                int mid = (start + end) / 2;
                sort(x, start, mid, THRESHOLD);
                sort(x, mid + 1, end, THRESHOLD);
                merge(x, start, end, mid);
            } else {
                insertionSort(x, start, end);
            }
        }
    }

    private static void merge(int[] x, int start, int end, int mid) {
        int temp[] = new int[end - start + 1];
        int first1 = start;
        int last1 = mid;
        int first2 = mid + 1;
        int last2 = end;
        int i = 0;
        for (; first1 <= last1 && first2 <= last2; i++) {
            if (x[first1] < x[first2]) {
                temp[i] = x[first1++];
            } else {
                temp[i] = x[first2++];
            }
        }
        while (first1 <= last1) {
            temp[i++] = x[first1++];
        }
        while (first2 <= last2) {
            temp[i++] = x[first2++];
        }
        int index = start;
        for (int j : temp) {
            x[index++] = j;
        }
    }

    private static void insertionSort(int[] arr, int start, int end) {
        for (int i = start+1; i <=end; i++) {
            int num = arr[i];
            int j = i - 1;
            while (j >= start && arr[j] > num) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = num;
        }
    }
}
