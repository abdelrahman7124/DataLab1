public abstract class Sort {

    public static void BubbleSort(int[] arr) {
        boolean sorted = false;
        for (int i = 0; !sorted && i < arr.length; i++) {
            sorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void selectionSort(int[] list) {
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

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int num = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > num) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = num;
        }
    }

}
