import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selection = 0;
        do {
            System.out.println("Choose an Option: \n1- Generate and Sort an Array\n2- Find Kth smallest in an Array");
            selection = scan.nextInt();

            if (selection == 1)
                while (true) {
                    System.out.print("Enter size of the array <0 to exit>: ");
                    int size = scan.nextInt();
                    if (size > 0) {
                        Sort_displayTime(getRandomArray(size));
                    } else {
                        break;
                    }
                }
            else if (selection == 2) {
                getKthSmallest();
            }
        } while (selection < 1 || selection > 2);
    }

    public static void Sort_displayTime(int[] arr) {
        int[] bubbleCopy, insertionCopy, selectionCopy, heapCopy, quickCopy;
        long startTime, endTime, actualTime;

        Sort bubbleSort = new BubbleSort();
        Sort insertionSort = new InsertionSort();
        Sort selectionSort = new SelectionSort();
        Sort heapSort = new HeapSort();
        Sort quickSort = new QuickSort();

        bubbleCopy = arr.clone();
        insertionCopy = arr.clone();
        selectionCopy = arr.clone();
        heapCopy = arr.clone();
        quickCopy = arr.clone();

        startTime = System.nanoTime();
        bubbleSort.sort(bubbleCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime) / 1000;
        System.out.println("Running time for " + arr.length + " elements Bubble Sort  is: " + actualTime + " Ms");

        startTime = System.nanoTime();
        insertionSort.sort(insertionCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime) / 1000;
        System.out.println("Running time for " + arr.length + " elements Insertion Sort  is: " + actualTime + " Ms");

        startTime = System.nanoTime();
        selectionSort.sort(selectionCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime) / 1000;
        System.out.println("Running time for " + arr.length + " Selection Sort  is: " + actualTime + " Ms");

        startTime = System.nanoTime();
        heapSort.sort(heapCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime) / 1000;
        System.out.println("Running time for " + arr.length + " Heap Sort  is: " + actualTime + " Ms");

        startTime = System.nanoTime();
        quickSort.sort(quickCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime) / 1000;
        System.out.println("Running Time for " + arr.length + " Quick Sort is " + actualTime + " Ms");
    }

    public static void getKthSmallest() {

        QuickSort quickSort = new QuickSort();

        int k, size = 0;

        while (true) {
            System.out.print("Enter size of the array <0 to exit>: ");
            size = scan.nextInt();

            System.out.print("Enter K:");
            k = scan.nextInt();

            if (size >= 0 && k>0 && k<= size)
                break;
        }

        int[] arr = new int[size];

        System.out.print("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int smallest = quickSort.getKthSmallest(arr, 0, arr.length - 1, k);

        switch (k){
            case 1: System.out.println("1st Smallest element is " + smallest);
                break;
            case 2:System.out.println("2nd Smallest element is " + smallest);
                break;
            case 3:System.out.println("3rd Smallest element is " + smallest);
                break;
            default:System.out.println(k + "th Smallest element is " + smallest);
        }
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
