package userRegistrationRegex;
import java.util.regex.Pattern;

@FunctionalInterface
interface validation
{
	boolean validate(String msg);
}

public class userRegistration {
	
	
	public String validateFname(String fname) throws userRegistrationException {
		
		validation valid_fname = (firstName) -> (Pattern.compile(pattern.first).matcher(firstName).matches());
		if(valid_fname.validate(fname))
			return "Valid First Name";
		else
			throw new userRegistrationException("Invalid fisrt name");
	}
	public String validateLname(String lname) throws userRegistrationException {
		
		validation valid_lname = (lastname) -> (Pattern.compile(pattern.last).matcher(lastname).matches());
		
		if(valid_lname.validate(lname))
			return "Valid Last Name";
		else
			throw new userRegistrationException("Invalid Last Name");
	}
	public String validateEmail(String email) throws userRegistrationException {
		
		validation valid_email = (em) -> (Pattern.compile(pattern.email).matcher(em).matches());

		if(valid_email.validate(email))
			return "Valid Email Address";
		else
			throw new userRegistrationException("Invalid Email Address");
	}
	public String validatePhno(String phn) throws userRegistrationException {
		
		validation valid_phno = (mob) -> (Pattern.compile(pattern.phno).matcher(mob).matches());
		
		if(valid_phno.validate(phn))
			return "Valid Phone Number";
		else
			throw new userRegistrationException("Invalid Phone Number");
	}
	public String validatePassword(String password) throws userRegistrationException {
		
		validation valid_password = (pass) -> (Pattern.compile(pattern.password).matcher(pass).matches());
		
		if(valid_password.validate(password))
			return "Valid Password";
		else
			throw new userRegistrationException("Invalid Password");

	}

}
