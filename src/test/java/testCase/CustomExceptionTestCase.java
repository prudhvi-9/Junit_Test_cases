package testCase;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import main.InvalidUserDetailException;
import main.UserRegistrationCustomException;

public class CustomExceptionTestCase {

	/*
	 * A new object user is created.
	 */

	UserRegistrationCustomException user = new UserRegistrationCustomException();

	/*
	 * Junit Test to validate the FirstName.
	 */
	@Test
	public void isValidFirstName() throws InvalidUserDetailException {
		boolean actualOutput = user.isValidFirstName("fg");
		assertTrue(actualOutput);

	}

	/*
	 * Junit Test to validate the LastName.
	 */
	@Test
	public void isValidLastName() throws InvalidUserDetailException {
		boolean actualOutput = user.isValidLastName("Kiran");
		assertTrue(actualOutput);
	}

	/*
	 * Junit Test to validate the email .
	 */
	@Test
	public void isValidemail() throws InvalidUserDetailException {
		boolean actualOutput = user.isValidemail(".xyz@bl.co.in");
		assertTrue(actualOutput);
	}

	/*
	 * Junit Test to validate the PhoneNumber .
	 */
	@Test
	public void isValidPhoneNumber() throws InvalidUserDetailException {
		boolean actualOutput = user.isValidPhoneNumber("99898984353");
		assertTrue(actualOutput);
	}

	/*
	 * Junit Test to validate the Password .
	 */
	@Test
	public void isValidPassword() throws InvalidUserDetailException {
		boolean actualOutput = user.isValidPassword("av6");
		assertTrue(actualOutput);
	}

}
