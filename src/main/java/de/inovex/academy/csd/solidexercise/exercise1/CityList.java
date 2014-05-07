package de.inovex.academy.csd.solidexercise.exercise1;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CityList {
	private final List<City> cities = new ArrayList<City>();

	public void addCity(City city) {
		cities.add(city);
	}

	public void removeCity(City city) {
		cities.remove(city);
	}

	public int numberOfCities() {
		return cities.size();
	}

	public void printCitiesOrderedByZipcode(PrintWriter writer) {
		Collections.sort(cities, new Comparator<City>() {
			@Override
			public int compare(City a, City b) {
				return compareInts(a.getZipcode(), b.getZipcode());
			}
		});
		for (City city : cities) {
			writer.println(city);
		}
	}

	private int compareInts(int a, int b) {
		return new Integer(a).compareTo(new Integer(b));
	}
}
