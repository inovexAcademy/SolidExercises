package de.inovex.academy.csd.solidexercise.exercise2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Goal: Clean up ErrorLogger
 * 
 * Tip: you may change Error too
 * 
 */
public class ErrorLoggerTest {
	private final StringWriter buffer = new StringWriter();
	ErrorLogger logger = new ErrorLogger(new PrintWriter(buffer));
	List<Error> errors = new ArrayList<Error>();

	@Test
	public void errorMessageIsIncluded() {
		Error error = new Error("FAIL!");
		errors.add(error);

		logger.logErrors(errors);

		assertThat(buffer.toString(), containsString("FAIL!"));
	}

	@Test
	public void errorLogging() {
		Error error = new Error("FAIL!");
		errors.add(error);

		logger.logErrors(errors);

		assertThat(buffer.toString(), startsWith("ERROR"));
	}

	@Test
	public void warningLogging() {
		Error warning = new Error("WRIST SLAP!", true);
		errors.add(warning);

		logger.logErrors(errors);

		assertThat(buffer.toString(), startsWith("WARN"));
	}
}
