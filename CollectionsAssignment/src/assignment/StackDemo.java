package assignment;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack Elements: " + s);

        System.out.println("Popped Element: " + s.pop());

        System.out.println("Stack After Pop: " + s);
    }
}
