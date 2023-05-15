package main;

import java.util.regex.Pattern;

public class UserRegistrationCustomException {

	/**
	 * To check if first name is valid or not.
	 */
	public boolean isValidFirstName(String firstName) {
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
	public boolean isValidLastName(String lastName) {
		/*
		 * To validate LastName.
		 */
		boolean result = Pattern.matches("^[A-Z]\\w{3,20}$", lastName);

		/*
		 * To throw custom exceptions in case of invalid LastName .
		 * 
		 */
		try {
			if (result) {
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
	public boolean isValidemail(String email) {

		/*
		 * To validate Email.
		 */
		boolean result = Pattern.matches("^[a-zA-Z0-9][_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}[,.a-z]+)+",
				email);

		/*
		 * To throw custom exceptions in case of invalid Email .
		 * 
		 */
		try {
			if (result) {
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
	public boolean isValidPhoneNumber(String phoneNumber) {

		/*
		 * To validate PhoneNumber.
		 */
		boolean result = Pattern.matches("^91\\s[0-9]{10}$", phoneNumber);

		/*
		 * To throw custom exceptions in case of invalid PhoneNumber .
		 * 
		 */
		try {
			if (result) {
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
	public boolean isValidPassword(String password) {

		/*
		 * To validate Password.
		 */
		boolean result = Pattern.matches("[[A-Z]+[a-z]+[@#!$%^&*?|]{1}[0-9]+]{8,}", password);

		/*
		 * To throw custom exceptions in case of invalid Password .
		 * 
		 */
		try {
			if (result) {
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
