import java.util.Random;

public class QuickSort extends Sort {

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int start, int end) {

        if (end <= start)
            return;

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

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static void swap(int[] arr ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}