package pckg;

public class CompareStrings {
    public static void main(String[] args) {
        String a = "abc", b = "abd";
        System.out.println("equals? " + a.equals(b));
        System.out.println("compareTo: " + a.compareTo(b)); // negative if a < b
    }
}
