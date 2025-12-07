package assignment;


	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class PhoneValidation1 {

	    public static void main(String[] args) {

	        String phone = "+1-456-765-9345";

	        String regex = "^[+]{1}[0-9]{1}[-][0-9]{3}[-][0-9]{3}[-][0-9]{4}$";

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(phone);

	        if (matcher.matches()) {
	            System.out.println(phone + " is a Valid Phone Number");
	        } else {
	            System.out.println(phone + " is an Invalid Phone Number");
	        }
	    }
	}
