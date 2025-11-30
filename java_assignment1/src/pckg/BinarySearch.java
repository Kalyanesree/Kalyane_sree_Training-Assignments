package pckg;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sorted = {1, 2, 3, 4, 5};
        int key = 4;
        int idx = Arrays.binarySearch(sorted, key); // built-in
        System.out.println("binarySearch result: " + idx);
    }
}
