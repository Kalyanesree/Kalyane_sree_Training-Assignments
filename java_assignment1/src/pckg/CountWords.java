package pckg;

public class CountWords {
    public static void main(String[] args) {
        String s = "  Java   is fun  ";
        s = s.trim();
        int words = s.isEmpty() ? 0 : s.split("\\s+").length;
        System.out.println("Words: " + words);
    }
}
