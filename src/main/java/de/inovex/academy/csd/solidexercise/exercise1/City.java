package de.inovex.academy.csd.solidexercise.exercise1;

public class City {
	private final int zipcode;
	private final String name;

	public City(int zipcode, String name) {
		this.zipcode = zipcode;
		this.name = name;
	}

	public int getZipcode() {
		return zipcode;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return zipcode + " " + name;
	}
}
