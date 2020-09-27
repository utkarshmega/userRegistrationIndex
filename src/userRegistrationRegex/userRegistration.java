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
		
		//Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher1 = pattern.matcher(lname);
		if(matcher1.matches())
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid Last Name");
		
		sc.close();

	}

}
