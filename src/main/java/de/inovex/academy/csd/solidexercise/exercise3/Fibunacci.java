package de.inovex.academy.csd.solidexercise.exercise3;

public class Fibunacci {
	public long fibunacci(int n) {
		long f = 0;
		long g = 1;
		for (int i = 1; i <= n; i++) {
			f = f + g;
			g = f - g;
		}
		return f;
	}
}
