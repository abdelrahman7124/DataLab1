import java.util.Random;

public class QuickSort extends Sort {

    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int start, int end){
        if (end <= start)
            return;

        int pivot = partition(arr, start, end);

        sort(arr, start, pivot - 1);
        sort(arr, pivot + 1, end);
    }

    public int getKthSmallest(int[] arr, int start, int end, int k){
         if (end <= start)
            return -1;
        
        int pivot = partition(arr, start, end);

        if(k-1 < pivot)
            return getKthSmallest(arr, start, pivot - 1, k);
        else if (k-1 > pivot)
            return getKthSmallest(arr, pivot + 1, end, k);
        else
            return arr[pivot];
    }

    private static int partition(int[] arr, int start, int end) {
        int randomFromRange = new Random().nextInt(end - start) + start;
        swap(arr, randomFromRange, end);

        int pivot = end;
        int j = start - 1;

        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[pivot]) {
                j++;
                swap(arr, i, j);
            }
        }

        pivot = ++j;
        swap(arr, j, end);

        return pivot;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
