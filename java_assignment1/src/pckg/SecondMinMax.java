package pckg;

import java.util.TreeSet;

public class SecondMinMax {
    public static void main(String[] args) {
        int[] a = {5, 2, 5, 3, 2, 1, 4};
        TreeSet<Integer> s = new TreeSet<>();
        for (int x : a) s.add(x); // distinct & sorted
        System.out.println("2nd largest: " + (s.size() < 2 ? null : s.lower(s.last())));
        System.out.println("2nd smallest: " + (s.size() < 2 ? null : s.higher(s.first())));
    }
}
