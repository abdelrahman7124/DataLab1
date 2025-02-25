import java.util.ArrayList;
import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();


        ArrayList<Integer> list = getRandomIntegerArrayList(100000);
        ArrayList<Integer> temp = (ArrayList<Integer>) list.clone();
        ArrayList<Integer> temp2 = (ArrayList<Integer>) list.clone();

        long startTime = System.currentTimeMillis();
        selectionSort.selectionSort(temp);
        long endTime = System.currentTimeMillis();
        long actualTime = endTime - startTime;
        System.out.println("Running time for Slection Sort  is "+actualTime+" ms");



    }
    public static ArrayList<Integer> getRandomIntegerArrayList(int size) {
        ArrayList<Integer> Array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            Array.add(random.nextInt(100));
        }
        return Array;
    }
}
