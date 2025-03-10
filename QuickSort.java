public class QuickSort extends Sort{

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int start, int end) {

        if (end <= start)
            return;

        int pivot = end;
        int j = start - 1;

        for (int i = start; i <= end - 1; i++){
            if (arr[i] < arr[pivot]){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        j++;
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        pivot = j;

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }
}