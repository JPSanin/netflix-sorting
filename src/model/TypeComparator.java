package model;

import java.util.Comparator;

public class TypeComparator implements Comparator<Item>{

	@Override
	public int compare(Item i1, Item i2) {
		
		return i1.getType().compareTo(i2.getType());
	}

}
