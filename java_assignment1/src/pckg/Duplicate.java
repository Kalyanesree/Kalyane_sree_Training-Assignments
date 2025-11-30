package pckg;

import java.util.HashSet;
import java.util.Set;

public class Duplicate{
    public static void main(String[] args) {
        String s = "banana";
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) if (seen.add(c)) sb.append(c);
        System.out.println(sb.toString());
    }
}
