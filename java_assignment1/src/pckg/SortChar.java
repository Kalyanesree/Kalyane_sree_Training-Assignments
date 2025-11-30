package pckg;

import java.util.Arrays;

public class SortChar {
    public static void main(String[] args) {
        String s = "dbca";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(new String(c)); // "abcd"
    }
}
