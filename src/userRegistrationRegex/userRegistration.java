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
		
		
		sc.close();

	}

}
