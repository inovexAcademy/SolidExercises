package de.inovex.academy.csd.solidexercise.exercise2;

import java.io.PrintWriter;
import java.util.List;

public class ErrorLogger {
	private final PrintWriter log;

	public ErrorLogger(PrintWriter log) {
		this.log = log;
	}

	public void logErrors(List<Error> errors) {
		StringBuilder logline = new StringBuilder();
		for (Error error : errors) {
			if (error.isWarning()) {
				logline.append("WARN");
			} else {
				logline.append("ERROR");
			}
			logline.append(": ");
			logline.append(error.getMessage());
			log.println(logline);
		}
	}

}
