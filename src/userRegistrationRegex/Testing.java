package userRegistrationRegex;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void testFname() {
		userRegistration obj = new userRegistration();
		String output1 = obj.validateFname("Utkarsh");
		String output2 = obj.validateFname("utka");
		assertEquals("Valid First Name", output1 );
		assertEquals("Invalid First Name", output2 );
	}
	@Test
	public void testLname() {
		userRegistration obj = new userRegistration();
		String output1 = obj.validateLname("Agrawal");
		String output2 = obj.validateLname("agrawal");
		assertEquals("Valid Last Name", output1 );
		assertEquals("Invalid Last Name", output2 );
	}
	@Test
	public void testEmail() {
		userRegistration obj = new userRegistration();
		String output1 = obj.validateEmail("abc@gmail.com");
		String output2 = obj.validateEmail(".abc@gamil.com.com");
		assertEquals("Valid Email Address", output1 );
		assertEquals("Invalid Email Address", output2 );
	}
	@Test
	public void testPhn() {
		userRegistration obj = new userRegistration();
		String output1 = obj.validatePhno("91 9044961252");
		String output2 = obj.validatePhno("9044961252");
		assertEquals("Valid Phone Number", output1 );
		assertEquals("Invalid Phone Number", output2 );
	}
	@Test
	public void testPassword() {
		userRegistration obj = new userRegistration();
		String output1 = obj.validatePassword("la2Q@gnb");
		String output2 = obj.validatePassword("abcd");
		assertEquals("Valid Password", output1 );
		assertEquals("Invalid Password", output2 );
	}

}
