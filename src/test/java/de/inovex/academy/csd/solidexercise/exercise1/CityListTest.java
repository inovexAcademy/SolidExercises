package de.inovex.academy.csd.solidexercise.exercise1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Test;

/**
 * Goal: Clean up CityList; Don't be afraid to change it's interface
 * 
 * Tip: leave City as it is
 */
public class CityListTest {
	private final City london = new City(1234, "London");
	private final City frankfurt = new City(2345, "Frankfurt");
	private final CityList cityList = new CityList();

	private static final String NEWLINE = System.getProperty("line.separator");

	@Test
	public void addingOfCities() {
		cityList.addCity(london);

		assertThat(cityList.numberOfCities(), equalTo(1));
	}

	@Test
	public void removingOfCities() {
		cityList.addCity(london);
		cityList.removeCity(london);

		assertThat(cityList.numberOfCities(), equalTo(0));
	}

	@Test
	public void printingCityListSortedByZipcode() {
		StringWriter buffer = new StringWriter();

		cityList.addCity(frankfurt);
		cityList.addCity(london);
		cityList.printCitiesOrderedByZipcode(new PrintWriter(buffer));

		assertThat(buffer.toString(), equalTo(london + NEWLINE + frankfurt + NEWLINE));
	}
}
