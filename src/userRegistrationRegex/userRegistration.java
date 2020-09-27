package userRegistrationRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String fname = sc.next();
		
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(fname);
		if(matcher.matches())
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid First Name");
		
		System.out.println("Enter Last name");
		String lname = sc.next();
		
		Matcher matcher1 = pattern.matcher(lname);
		if(matcher1.matches())
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid Last Name");
		
		System.out.println("Enter Email Address");
		String email = sc.next();
		String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern2 = Pattern.compile(pattern_email);
		Matcher matches2 = pattern2.matcher(email);
		if(matches2.matches())
			System.out.println("Valid Email Address");
		else
			System.out.println("Invalid Email Address");
		
		System.out.println("Enter Phone number with country code");
		String phn = sc.next();
		String pattern_phn = "[0-9]{2}\\s[1-9]{1}[0-9]{9}$";
		Pattern pattern3 = Pattern.compile(pattern_phn);
		Matcher matcher3 = pattern3.matcher(phn);
		if(matcher3.matches())
			System.out.println("Valid Phone Number");
		else
			System.out.println("Invalid Phone Number");
		
		System.out.println("Enter Password");
		String password = sc.next();
		String pass_pattern = "(?=.*[0-9])(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[A-Z])[^\\s]{8,}$";
		Pattern pattern4 = Pattern.compile(pass_pattern);
		Matcher matcher4 = pattern4.matcher(password);
		if(matcher4.matches())
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		
		sc.close();

	}

}
