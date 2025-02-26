public class InsertionSort {
    public void sort(int[] list) {
        // Start with second element in the list and compare each element with all elements on the left side
        for (int i = 1; i < list.length; i++) {

            int num = list[i];
            int j = i - 1;
            boolean swapped;

            do {
                if (num < list[j]) {
                    swapped = true;
                    int temp = num;
                    list[j + 1] = list[j];
                    list[j] = temp;
                    j--;
                } else {
                    swapped = false;
                }
            } while (j >= 0 && swapped);
        }
    }
}
