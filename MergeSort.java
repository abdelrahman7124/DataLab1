public class MergeSort extends Sort{

    //The method which user calls (creates the start,end form)
    public void sort(int[] x) {
        if (x.length <= 1) {
            return;
        }
        sort(x, 0, x.length - 1);
    }

    private static void sort(int[] x, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(x, start, mid);
            sort(x, mid + 1, end);
            merge(x, start, end, mid);
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

}
