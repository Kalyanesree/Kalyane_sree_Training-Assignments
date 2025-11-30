package pckg;

import java.util.ArrayList;
import java.util.List;

public class Substring {
    public static void main(String[] args) {
        String text = "abababa", pat = "aba";
        List<Integer> idx = new ArrayList<>();
        for (int i = text.indexOf(pat, 0); i >= 0; i = text.indexOf(pat, i + 1)) idx.add(i);
        System.out.println(idx); // [0, 2, 4]
    }
}
