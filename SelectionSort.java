public class SelectionSort {
    public void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int idx = i;
            for (int j = i; j < list.length; j++) {
                if (list[j] < list[idx]) {
                    idx = j;
                }
            }
            int temp = list[idx];
            list[idx] = list[i];
            list[i] = temp;
        }
    }
}
