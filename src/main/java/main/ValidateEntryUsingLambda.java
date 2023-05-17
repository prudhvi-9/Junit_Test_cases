package main;

import java.util.regex.Pattern;

/*
 * Functional Interface
 */
interface FirstName {
	boolean isValidFirstName(String string);
}

interface LastName {
	boolean isValidLastName(String string);
}

interface Email {
	boolean isValidemail(String string);
}

interface PhoneNumber {
	boolean isValidPhoneNumber(String string);
}

interface Password {
	boolean isValidPassword(String string);
}

public class ValidateEntryUsingLambda {
	/*
	 * This method is created to validate details of the user using lambda function.
	 */

	public static void main(String[] args) {
		/*
		 * Using lambda function to validate First Name.
		 */
		FirstName firstName = (string) -> {
			return isValidFirstName(string);
		};
		firstName.isValidFirstName("Kiran");

		/*
		 * Using lambda function to validate Last Name.
		 */
		LastName lastName = (string) -> {
			return isValidLastName(string);
		};
		lastName.isValidLastName("Sharma");

		/*
		 * Using lambda function to validate Email.
		 */
		Email email = (string) -> {
			return isValidemail(string);
		};
		email.isValidemail("abc@yahoo.com,");

		/*
		 * Using lambda function to validate PhoneNumber .
		 */
		PhoneNumber phoneNumber = (string) -> {
			return isValidPhoneNumber(string);
		};
		phoneNumber.isValidPhoneNumber("91 9898984353");

		/*
		 * Using lambda function to validate Password .
		 */
		Password password = (string) -> {
			return isValidPassword(string);
		};
		password.isValidPassword("Ravitej$89");

	}

	/**
	 * To check if first name is valid or not.
	 */
	static boolean isValidFirstName(String firstName) {
		/*
		 * To validate FirstName.
		 */
		boolean result = Pattern.matches("^[A-Z]\\w{3,20}$", firstName);

		/*
		 * To throw custom exceptions in case of invalid FirstName .
		 * 
		 */
		try {
			if (result) {
				System.out.println("Valid  First Name");
				return true;
			} else {
				throw new InvalidUserDetailException("Enter valid first name");
			}
		} catch (InvalidUserDetailException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	/**
	 * To check if LastName is valid or not.
	 */
	static boolean isValidLastName(String string) {
		/*
		 * To validate LastName.
		 */
		boolean result = Pattern.matches("^[A-Z]\\w{3,20}$", string);

		/*
		 * To throw custom exceptions in case of invalid LastName .
		 * 
		 */
		try {
			if (result) {
				System.out.println("Valid  Last Name");
				return true;
			} else {
				throw new InvalidUserDetailException("Enter valid last name");
			}
		} catch (InvalidUserDetailException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	/**
	 * To check if email is valid or not.
	 */
	static boolean isValidemail(String string) {

		/*
		 * To validate Email.
		 */
		boolean result = Pattern.matches("^[a-zA-Z0-9][_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}[,.a-z]+)+",
				string);

		/*
		 * To throw custom exceptions in case of invalid Email .
		 * 
		 */
		try {
			if (result) {
				System.out.println("Valid  Email");
				return true;
			} else {
				throw new InvalidUserDetailException("Enter valid email");
			}
		} catch (InvalidUserDetailException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	/**
	 * To check if PhoneNumber is valid or not.
	 */
	static boolean isValidPhoneNumber(String string) {

		/*
		 * To validate PhoneNumber.
		 */
		boolean result = Pattern.matches("^91\\s[0-9]{10}$", string);

		/*
		 * To throw custom exceptions in case of invalid PhoneNumber .
		 * 
		 */
		try {
			if (result) {
				System.out.println("Valid  PhoneNumber");
				return true;
			} else {
				throw new InvalidUserDetailException("Enter valid phoneNumber");
			}
		} catch (InvalidUserDetailException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	/**
	 * To check if Password is valid or not.
	 */
	static boolean isValidPassword(String string) {

		/*
		 * To validate Password.
		 */
		boolean result = Pattern.matches("[[A-Z]+[a-z]+[@#!$%^&*?|]{1}[0-9]+]{8,}", string);

		/*
		 * To throw custom exceptions in case of invalid Password .
		 * 
		 */
		try {
			if (result) {
				System.out.println("Valid  Password");

				return true;
			} else {
				throw new InvalidUserDetailException("Enter valid Password");
			}
		} catch (InvalidUserDetailException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}
