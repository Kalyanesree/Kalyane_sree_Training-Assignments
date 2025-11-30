package pckg;

public class CountChar {
    public static void main(String[] args) {
        String s = "ab12! c";
        int digits = 0, alpha = 0, special = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) digits++;
            else if (Character.isLetter(ch)) alpha++;
            else if (!Character.isWhitespace(ch)) special++;
        }
        System.out.println("digits=" + digits + " alpha=" + alpha + " special=" + special);
    }
}
