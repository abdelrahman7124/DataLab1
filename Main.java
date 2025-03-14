import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selection = 0;
        do {
            System.out.println("Choose an Option: \n1- Generate and Sort an Array\n2- Find Kth smallest in an Array\n3-To exit");
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
                System.out.print("Enter size of the array: ");
                int size = scan.nextInt();
                getKthSmallest(getRandomArray(size));
            }
            else if (selection == 3) {
                break;
            }
        } while (selection < 1 || selection > 3);
    }

    public static void Sort_displayTime(int[] arr) {
        int[] bubbleCopy, insertionCopy, selectionCopy,heapCopy,mergeCopy,quickCopy,hybridCopy;
        long startTime, endTime, actualTime;

        Sort bubbleSort = new BubbleSort();
        Sort insertionSort = new InsertionSort();
        Sort selectionSort = new SelectionSort();
        Sort heapSort = new HeapSort();
        Sort mergeSort = new MergeSort();
        Sort quickSort = new QuickSort();
        HybridSort hybridSort = new HybridSort();

        bubbleCopy = arr.clone();
        insertionCopy = arr.clone();
        selectionCopy = arr.clone();
        heapCopy = arr.clone();
        mergeCopy = arr.clone();
        quickCopy = arr.clone();
        hybridCopy = arr.clone();

        startTime = System.nanoTime();
        bubbleSort.sort(bubbleCopy);
        endTime = System.nanoTime();

        actualTime = (endTime - startTime)/1000;
        System.out.println("Running time for " + arr.length + " elements using Bubble Sort  is: " + actualTime + " Ms");


        startTime = System.nanoTime();
        insertionSort.sort(insertionCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime)/1000;
        System.out.println("Running time for " + arr.length + " elements using Insertion Sort  is: " + actualTime + " Ms");


        startTime = System.nanoTime();
        selectionSort.sort(selectionCopy);
        endTime = System.nanoTime();

        actualTime = (endTime - startTime)/1000;
        System.out.println("Running time for " + arr.length + " elements using Selection Sort  is: " + actualTime + " Ms");


        startTime = System.nanoTime();
        heapSort.sort(heapCopy);
        endTime = System.nanoTime();

        actualTime = (endTime - startTime) / 1000;
        System.out.println("Running time for " + arr.length + " elements using Heap Sort  is: " + actualTime + " Ms");

        startTime = System.nanoTime();
        quickSort.sort(quickCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime) / 1000;
        System.out.println("Running Time for " + arr.length + " elements using Quick Sort is " + actualTime + " Ms");

        startTime = System.nanoTime();
        mergeSort.sort(mergeCopy);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime) / 1000;
        System.out.println("Running Time for " + arr.length + " elements using Merge Sort is " + actualTime + " Ms");

        startTime = System.nanoTime();
        hybridSort.sort(hybridCopy,6);
        endTime = System.nanoTime();
        actualTime = (endTime - startTime) / 1000;
        System.out.println("Running Time for " + arr.length + " elements using Hybrid Sort is " + actualTime + " Ms");

    }

    public static void getKthSmallest(int[] arr) {
        QuickSort quickSort = new QuickSort();
        int k;

        System.out.print("Enter K:");
        k = scan.nextInt();

        System.out.println("Elements of the array are: "+ Arrays.toString(arr));


        int smallest = quickSort.getKthSmallest(arr, 0, arr.length - 1, k);
        quickSort.sort(arr);
        System.out.println("Sorted array just to check : "+ Arrays.toString(arr));
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
