import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();

        int[] list = getRandomIntegerArrayList(100000);

        int[] temp = (int[]) list.clone();
        int[] temp2 = (int[]) list.clone();
        int[] temp3 = (int[]) list.clone();

        long startTime = System.currentTimeMillis();
        selectionSort.selectionSort(temp);
        long endTime = System.currentTimeMillis();
        long actualTime = endTime - startTime;
        System.out.println("Running time for Selection Sort  is " + actualTime + " ms");

        startTime = System.currentTimeMillis();
        insertionSort.sort(temp2);
        endTime = System.currentTimeMillis();
        actualTime = endTime - startTime;
        System.out.println("Running time for Insertion Sort is " + actualTime + " ms");
    }

    public static int[] getRandomIntegerArrayList(int size) {
        int[] Array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            Array[i] = random.nextInt(100);
        }
        return Array;
    }
}
