package assignment;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(3, "Apple");
        tm.put(1, "Banana");
        tm.put(2, "Orange");

        System.out.println("\nKey and Values in Descending Order:");
        for (Map.Entry<Integer, String> entry : tm.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
