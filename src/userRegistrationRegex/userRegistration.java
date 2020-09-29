package userRegistrationRegex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {
	
	
	public String validateFname(String fname) {		
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(fname);
		if(matcher.matches())
			return "Valid First Name";
		else
			return "Invalid First Name";
	}
	public String validateLname(String lname) {
		
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher1 = pattern.matcher(lname);
		if(matcher1.matches())
			return "Valid Last Name";
		else
			return "Invalid Last Name";
	}
	public String validateEmail(String email) {

		String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern2 = Pattern.compile(pattern_email);
		Matcher matches2 = pattern2.matcher(email);
		if(matches2.matches())
			return "Valid Email Address";
		else
			return "Invalid Email Address";
	}
	public String validatePhno(String phn) {
	
		String pattern_phn = "[0-9]{2}\\s[1-9]{1}[0-9]{9}$";
		Pattern pattern3 = Pattern.compile(pattern_phn);
		Matcher matcher3 = pattern3.matcher(phn);
		if(matcher3.matches())
			return "Valid Phone Number";
		else
			return "Invalid Phone Number";
	}
	public String validatePassword(String password) {
		
		String pass_pattern = "(?=.*[0-9])(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[A-Z])[^\\s]{8,}$";
		Pattern pattern4 = Pattern.compile(pass_pattern);
		Matcher matcher4 = pattern4.matcher(password);
		if(matcher4.matches())
			return "Valid Password";
		else
			return "Invalid Password";

	}

}
