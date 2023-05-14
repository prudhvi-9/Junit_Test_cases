package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValidEmail {
	/**
	 * To check if email is valid or not.
	 */
	public boolean validateEmail(String email) {
		/*
		 * Regex to check valid email .
		 */
		String regex = "^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$";

		/*
		 * To compile the Regex.
		 */
		Pattern p = Pattern.compile(regex);

		/*
		 * If the email is empty,return false.
		 */

		if (email == null) {
			return false;
		}

		/*
		 * To find matching between given email and regular expression.
		 */

		Matcher m = p.matcher(email);

		/*
		 * Return if the email matched the Regex.
		 */

		return m.matches();
	}
}
