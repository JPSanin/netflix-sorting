package model;

import java.util.Comparator;

public class ReleaseYearComparator implements Comparator<Item> {

	@Override
	public int compare(Item i1, Item i2) {
		return i1.getReleaseYear()-i2.getReleaseYear();
	}

}
