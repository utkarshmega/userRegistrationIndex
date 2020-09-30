package userRegistrationRegex;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingException {

	//Happy Test Case
	@Test
	public void testFname() {
		userRegistration obj = new userRegistration();
		try {
			String output1 = obj.validateFname("Utkarsh");
			assertEquals("Valid First Name", output1 );
		}
		catch (userRegistrationException e){
			System.out.println("e.getMessage");
		}
	}
		//Sad Test Case
		@Test
		public void testFirstname() {
			userRegistration obj = new userRegistration();
			try {
				String output1 = obj.validateFname("utkarsh");
				assertEquals("Valid First Name", output1 );
			}
			catch (userRegistrationException e){
				System.out.println("e.getMessage");
			}		
	}
	//happy test last name	
	@Test
	public void testLname() {
		userRegistration obj = new userRegistration();
		try {
			String output1 = obj.validateLname("Agrawal");
			assertEquals("Valid Last Name", output1 );
		}
		catch(userRegistrationException e)
		{
			System.out.println(e.getMessage());
		}
	}
	//sad test last name	
		@Test
		public void testLastname() {
			userRegistration obj = new userRegistration();
			try {
				String output1 = obj.validateLname("agrawal");
				assertEquals("Valid Last Name", output1 );
			}
			catch(userRegistrationException e)
			{
				System.out.println(e.getMessage());
			}
		}
		//happy test case email
	@Test
	public void testEmail() {
		userRegistration obj = new userRegistration();
		try {
			String output1 = obj.validateEmail("abc@gmail.com");
			assertEquals("Valid Email Address", output1 );
		}
		catch(userRegistrationException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	//sad test case email
	@Test
	public void testmail() {
		userRegistration obj = new userRegistration();
		try {
			String output1 = obj.validateEmail(".abc@gmail.com");
			assertEquals("Valid Email Address", output1 );
		}
		catch(userRegistrationException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	//happy test case phn no
	@Test
	public void testPhn() {
		userRegistration obj = new userRegistration();
		try {
			String output1 = obj.validatePhno("91 9044961252");
			assertEquals("Valid Phone Number", output1 );
		}
		catch(userRegistrationException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	//sad test case phn no.
		@Test
		public void testPhno() {
			userRegistration obj = new userRegistration();
			try {
				String output1 = obj.validatePhno("044961252");
				assertEquals("Valid Phone Number", output1 );
			}
			catch(userRegistrationException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	//happy test case password	
	@Test
	public void testPassword() {
		userRegistration obj = new userRegistration();
		try {
			String output1 = obj.validatePassword("la2Q@gnb");
			assertEquals("Valid Password", output1 );
		}
		catch(userRegistrationException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	//sad test case password	
		@Test
		public void testPass() {
			userRegistration obj = new userRegistration();
			try {
				String output1 = obj.validatePassword("la2Qgnb");
				assertEquals("Valid Password", output1 );
			}
			catch(userRegistrationException e)
			{
				System.out.println(e.getMessage());
			}
			
		}

}
