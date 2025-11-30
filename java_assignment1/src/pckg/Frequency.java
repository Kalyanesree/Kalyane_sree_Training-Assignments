package pckg;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] a = {5, 2, 5, 3, 2, 1};
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int x : a) freq.put(x, freq.getOrDefault(x, 0) + 1);
        System.out.println(freq); // prints element -> count
    }
}
