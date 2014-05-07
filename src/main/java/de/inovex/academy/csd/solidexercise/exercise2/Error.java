package de.inovex.academy.csd.solidexercise.exercise2;

public class Error {
	private final String message;
	private boolean warning;

	public Error(String message) {
		this.message = message;
	}

	public Error(String message, boolean warning) {
		this(message);
		this.warning = warning;
	}

	public String getMessage() {
		return message;
	}

	public boolean isWarning() {
		return warning;
	}
}
