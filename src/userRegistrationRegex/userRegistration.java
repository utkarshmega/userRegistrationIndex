package userRegistrationRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {
	
	static void emailValidation(String email)
	{
		String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern2 = Pattern.compile(pattern_email);
		Matcher matches2 = pattern2.matcher(email);
		if(matches2.matches())
			System.out.println("Valid Email Address");
		else
			System.out.println("Invalid Email Address");
		
	}

	public static void main(String[] args) {
		
		emailValidation("abc@yahoo.com");
		emailValidation("abc-100@yahoo.com");
		emailValidation("abc.100@yahoo.com");
		emailValidation("abc111@abc.com");
		emailValidation("abc-100@abc.net");
		emailValidation("abc.100@abc.com.au");
		emailValidation("abc@1.com ");
		emailValidation("abc@gmail.com.com");
		emailValidation("abc+100@gmail.com");
		emailValidation("abc");
		emailValidation("abc@.com.my");
		emailValidation("abc123@gmail.a");
		emailValidation("abc123@.com");
		emailValidation("abc123@.com.com");
		emailValidation(".abc@abc.com");
		emailValidation("abc()*@gmail.com");
		emailValidation("abc@%*.com");
		emailValidation("abc..2002@gmail.com");
		emailValidation("abc@abc@gmail.com");
		emailValidation("abc@gmail.com.1a");
		emailValidation("abc@gmail.com.aa.au");
		
	}

}
