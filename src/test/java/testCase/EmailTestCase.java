package testCase;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.IsValidEmail;
/**
 * 
 * Parameterized Class.
 *
 */
@RunWith(Parameterized.class)
public class EmailTestCase {

	private final String emailTest;
	private final boolean expectedResult;
	private IsValidEmail validateEmail;
	/*
	 * Constructor.
	 */
	public EmailTestCase(String email, boolean expectedResult) {
		this.emailTest = email;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		validateEmail = new IsValidEmail();
	}
	/*
	 * Validating multiple email address  .
	 */
	@Parameterized.Parameters
	public static Collection<Object[]> data() {

		return Arrays.asList(new Object[][] { {"abc@yahoo.com", true },     {"abc-100@yahoo.com", true },
											  {"abc.100@yahoo.com", true }, {"abc111@abc.com", true }, 
											  {"abc-100@abc.net", true },	{"abc.100@abc.com.au", true }, 
											  {"abc@1.com", true },         {"abc@gmail.com.com", true },
											  {"abc+100@gmail.com", true }, {"abc", false },
											  {"abc@.com.my", false },      {"abc123@gmail.a", false },
											  {"abc123@.com", false },      {"abc123@.com.com", false }, 
											  {".abc@abc.com", false },     {"abc()*@gmail.com", false },
											  {"abc@%*.com", false },       {"abc..2002@gmail.com", false },
											  {"abc.@gmail.com", false },   {"abc@abc@gmail.com", false }, 
											  {"abc@gmail.com.1a", false }, {"abc@gmail.com.aa.au", false}});
				                             
	}
	/*
	 * Junit Test for validating  the email.
	 */
	@Test
	public void isEmailValid() {
		assertEquals(expectedResult, validateEmail.validateEmail(emailTest));
	}
}
