import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter size of the array <0 to exit>:");
            int size = scan.nextInt();
            if (size > 0) {
                Sort_displayTime(getRandomArray(size));
            } else {
                break;
            }
        }
    }

    public static void Sort_displayTime(int[] arr) {
        int[] bubbleCopy, insertionCopy, selectionCopy,heapCopy;
        long startTime, endTime, actualTime;
        Sort bubbleSort = new BubbleSort();
        Sort insertionSort = new InsertionSort();
        Sort selectionSort = new SelectionSort();
        Sort heapSort = new HeapSort();

        bubbleCopy = arr.clone();
        insertionCopy = arr.clone();
        selectionCopy = arr.clone();
        heapCopy = arr.clone();

        startTime = System.nanoTime();
        bubbleSort.sort(bubbleCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime)/1000;
        System.out.println("Running time for " + arr.length + " elements Bubble Sort  is: " + actualTime + " Ms");

        startTime = System.nanoTime();
        insertionSort.sort(insertionCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime)/1000;
        System.out.println("Running time for " + arr.length + " elements Insertion Sort  is: " + actualTime + " Ms");

        startTime = System.nanoTime();
        selectionSort.sort(selectionCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime)/1000;
        System.out.println("Running time for " + arr.length + " Selection Sort  is: " + actualTime + " Ms");

        startTime = System.nanoTime();
        heapSort.sort(heapCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime)/1000;
        System.out.println("Running time for " + arr.length + " Heap Sort  is: " + actualTime + " Ms");

    }

    public static int[] getRandomArray(int size) {
        int[] Array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            Array[i] = random.nextInt(100);
        }
        return Array;
    }
}
