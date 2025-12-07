package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneval {

    public static void main(String[] args) {

        String phone = "001-765-989-3421";

        String regex = "^[0-9]{3}[-][0-9]{3}[-][0-9]{3}[-][0-9]{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        if (matcher.matches()) {
            System.out.println(phone + " is a Valid Phone Number");
        } else {
            System.out.println(phone + " is an Invalid Phone Number");
        }
    }
}
