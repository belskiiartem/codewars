package validPhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
	  public static boolean validPhoneNumber(String phoneNumber) {
	    // TODO: Return whether phoneNumber is in the proper form
		  //\\d - digital symbol
		  //\\s - space
		  //[(] [)] - one char
		  // {n} -count for repeat
		  
		  Pattern pattern = Pattern.compile("[(]\\d{3}[)]\\s\\d{3}-\\d{4}");
		  return pattern.matcher(phoneNumber).matches();
	  }
}