package userRegistrationRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sampleCheck {
	
	public boolean validateEmail(String email)
	{
		String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern2 = Pattern.compile(pattern_email);
		Matcher matches2 = pattern2.matcher(email);
		if(matches2.matches())	
			return true;
		else
			return false;
	}

}
