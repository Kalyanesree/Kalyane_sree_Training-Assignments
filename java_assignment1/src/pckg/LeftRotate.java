package pckg;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 2;
        int len = a.length;
        n = ((n % len) + len) % len; // safe normalize
        int[] r = new int[len];
        for (int i = 0; i < len; i++) r[i] = a[(i + n) % len];
        System.out.println(Arrays.toString(r));
    }
}
