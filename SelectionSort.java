import java.util.ArrayList;

public class SelectionSort {
    public ArrayList<Integer> selectionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int idx = i;
            for (int j = i ; j < list.size(); j++) {
                if (list.get(j) < list.get(idx)) {
                    idx = j;
                }
            }
            int temp = list.get(idx);
            list.set(idx, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
}
