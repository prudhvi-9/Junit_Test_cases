package testCase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import main.UserRegistration;

public class UserRegistrationTestCase {

	/*
	 * A new object user is created.
	 */

	UserRegistration user = new UserRegistration();

	/*
	 * Junit Test for Happy Test Case validates the FirstName Entry Successfully
	 */
	@Test
	public void isValidFirstName() {
		System.out.println("Happy Test Case:\nisValidFirstName");
		boolean actualOutput = user.isValidFirstName("Kiran");
		assertTrue(actualOutput);
	}

	/*
	 * Junit Test for Sad Test Case fails the FirstName Entry.
	 * 
	 */
	@Test
	public void isNotValidFirstName() {
		System.out.println("Sad Test Case:\nisNotValidFirstName");
		boolean actualOutput = user.isValidFirstName("nick");
		assertFalse(actualOutput);
	}

	/*
	 * Junit Test for Happy Test Case validates the LastName Entry Successfully
	 */
	@Test
	public void isValidLastName() {
		System.out.println("Happy Test Case:\nisValidLastName");
		boolean actualOutput = user.isValidLastName("Kiran");
		assertTrue(actualOutput);
	}

	/*
	 * Junit Test for Sad Test Case fails the LastName Entry.
	 * 
	 */
	@Test
	public void isNotValidLastName() {
		System.out.println("Sad Test Case:\nisNotValidLastName");
		boolean actualOutput = user.isValidLastName("nick");
		assertFalse(actualOutput);
	}

	/*
	 * Junit Test for Happy Test Case validates the email Entry Successfully
	 */
	@Test
	public void isValidemail() {
		System.out.println("Happy Test Case:\nisValidemailemail");
		boolean actualOutput = user.isValidemail("abc.xyz@bl.co.in");
		assertTrue(actualOutput);
	}

	/*
	 * Junit Test for Sad Test Case fails the email Entry.
	 * 
	 */
	@Test
	public void isNotValidemail() {
		System.out.println("Sad Test Case:\nisNotValidemail");
		boolean actualOutput = user.isValidemail("ab.xy@ll.do");
		assertFalse(actualOutput);
	}

	/*
	 * Junit Test for Happy Test Case validates the PhoneNumber Entry Successfully
	 */
	@Test
	public void isValidPhoneNumber() {
		System.out.println("Happy Test Case:\nisValidPhoneNumber");
		boolean actualOutput = user.isValidPhoneNumber("91 9898984353");
		assertTrue(actualOutput);
	}

	/*
	 * Junit Test for Sad Test Case fails the PhoneNumber Entry.
	 * 
	 */
	@Test
	public void isNotValidPhoneNumber() {
		System.out.println("Sad Test Case:\nisNotValidPhoneNumber");
		boolean actualOutput = user.isValidPhoneNumber("919998987644");
		assertFalse(actualOutput);
	}

	/*
	 * Junit Test for Happy Test Case validates the Password Entry Successfully
	 */
	@Test
	public void isValidPassword() {
		System.out.println("Happy Test Case:\nisValidPassword");
		boolean actualOutput = user.isValidPassword("Ravitej$89");
		assertTrue(actualOutput);
	}

	/*
	 * Junit Test for Sad Test Case fails the Password Entry.
	 * 
	 */
	@Test
	public void isNotValidPassword() {
		System.out.println("Sad Test Case:\nisNotValidPassword");
		boolean actualOutput = user.isValidPassword("ravi");
		assertFalse(actualOutput);
	}

}
