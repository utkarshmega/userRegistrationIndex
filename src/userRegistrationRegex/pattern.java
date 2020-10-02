package userRegistrationRegex;

public class pattern {
	
	static String first = "^[A-Z][a-z]{2,}";
	static String last = "^[A-Z][a-z]{2,}";
	static String email = "^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$";
	static String phno = "[0-9]{2}\\\\s[1-9]{1}[0-9]{9}$";
	static String password = "(?=.*[0-9])(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[A-Z])[^\\\\s]{8,}$";
}
