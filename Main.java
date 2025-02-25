import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> getRandomIntegerArrayList(int size) {
        ArrayList<Integer> Array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            Array.add(random.nextInt());
        }
        return Array;
    }
}
