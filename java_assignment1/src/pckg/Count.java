package pckg;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] a = {-1, 0, 2, 3, 0, -5};
        int pos = 0, neg = 0, zero = 0;
        for (int x : a) { if (x > 0) pos++; else if (x < 0) neg++; else zero++; }
        System.out.println(Arrays.toString(new int[]{pos, neg, zero}));
    }
}
