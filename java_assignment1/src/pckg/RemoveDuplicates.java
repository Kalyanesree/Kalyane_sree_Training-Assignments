package pckg;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {5, 2, 5, 3, 2, 1};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : a) set.add(x);
        int[] res = set.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(res));
    }
}
