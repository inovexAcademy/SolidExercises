package de.inovex.academy.csd.solidexercise.exercise3;

import java.util.HashMap;
import java.util.Map;

public class FibunacciCache {
	private final Map<Integer, Long> cache = new HashMap<Integer, Long>();
	private final Fibunacci fib = new Fibunacci();

	public long fibuncacci(int n) {
		if (cache.containsKey(n)) {
			return cache.get(n);
		} else {
			long result = fib.fibunacci(n);
			cache.put(n, result);
			return result;
		}
	}
}
