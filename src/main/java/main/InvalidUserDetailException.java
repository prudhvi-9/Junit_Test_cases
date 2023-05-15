package main;

public class InvalidUserDetailException extends Exception {

	private static final long serialVersionUID = 1L;

	/*
	 * Constructor
	 */
	public InvalidUserDetailException(String message) {
		super(message);
	}
}
