package pckg;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "aabca";
        Map<Character, Integer> f = new LinkedHashMap<>();
        for (char c : s.toCharArray()) f.put(c, f.getOrDefault(c, 0) + 1);
        System.out.println(f);
    }
}
