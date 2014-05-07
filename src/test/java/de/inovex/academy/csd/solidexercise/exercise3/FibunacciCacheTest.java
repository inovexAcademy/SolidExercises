package de.inovex.academy.csd.solidexercise.exercise3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Goal: Clean up FibunacciCache, so the cache functionality can easily be
 * tested
 * 
 */
public class FibunacciCacheTest {
	private final FibunacciCache fibCache = new FibunacciCache();

	@Test
	public void fibunacciSequence() {
		assertThat(fibCache.fibuncacci(1), equalTo(1L));
		assertThat(fibCache.fibuncacci(2), equalTo(1L));
		assertThat(fibCache.fibuncacci(3), equalTo(2L));
		assertThat(fibCache.fibuncacci(4), equalTo(3L));
		assertThat(fibCache.fibuncacci(5), equalTo(5L));
		assertThat(fibCache.fibuncacci(1000), equalTo(817770325994397771L));
	}

	@Test
	public void cacheIsUtilized() {
		assertThat(fibCache.fibuncacci(1000), equalTo(817770325994397771L));
		assertThat(fibCache.fibuncacci(1000), equalTo(817770325994397771L));

		/** ??????? **/
	}

}
