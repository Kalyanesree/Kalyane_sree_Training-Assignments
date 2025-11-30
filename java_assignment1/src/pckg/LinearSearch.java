package pckg;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {5, 2, 3, 4};
        int key = 3, idx = -1;
        for (int i = 0; i < a.length; i++) if (a[i] == key) { idx = i; break; }
        System.out.println("Index: " + idx);
    }
}
