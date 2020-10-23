package model;

import java.util.Arrays;

import processing.core.PApplet;
import processing.core.PImage;

public class ItemList {

	private Item[] items;
	private NameComparator nc;
	private ReleaseYearComparator ryc;
	private TypeComparator tc;
	private PApplet app;
	public ItemList(PApplet app) {
		items= new Item[7];
		nc= new NameComparator();
		ryc= new ReleaseYearComparator();
		tc= new TypeComparator();
		this.app=app;
	}
	
	public void addItems(String[] input, PImage[] images) {
		for (int i = 0; i < input.length; i++) {
			String[] info=input[i].split(",");
			items[i]= new Item(info[0].trim(), Integer.parseInt(info[1].trim()), 
					Integer.parseInt(info[2].trim()), info[3].trim(), images[i], app);	
	}
	}
	
	public void sort(char c) {
		String[] export= new String [8];
		export[0]= "Name | Release Year | Rating | Type ";
		String exportname="";
		switch(c) {
		
		case 'r':
			Arrays.sort(items);
			exportname="Rating Export";
			for (int i = 0; i < items.length; i++) {
				export[i+1]= items[i].exportString('r');
			}


			break;
		case 'a':
			Arrays.sort(items,ryc);
			exportname="Year Export";
			for (int i = 0; i < items.length; i++) {
				export[i+1]= items[i].exportString('a');
			}
		
			break;
		case 'n':
			Arrays.sort(items,nc);
			exportname="Name Export";
			for (int i = 0; i < items.length; i++) {
				export[i+1]= items[i].exportString('n');
			}
			break;
		case 't':
			Arrays.sort(items,tc);
			exportname="Type Export";
			for (int i = 0; i < items.length; i++) {
				export[i+1]= items[i].exportString('t');
			}
			break;
		}
		
		app.saveStrings("data/"+exportname+".txt", export);
	}
	
	

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	
	
	
	
}
