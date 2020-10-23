package controller;

import model.ItemList;
import processing.core.PApplet;
import processing.core.PImage;

public class Controller {
	private ItemList itemList;
	
	
	public Controller(PApplet app) {
		itemList= new ItemList(app);
	}
	
	public void addItems(String[] input, PImage[] images) {
		itemList.addItems(input, images);
	}
	
	public void sort(char c) {
		itemList.sort(c);
	}

	public ItemList getItemList() {
		return itemList;
	}
	
	

}
