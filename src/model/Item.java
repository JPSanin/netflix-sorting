package model;


import processing.core.PApplet;
import processing.core.PImage;

public class Item implements Comparable<Item> {
	private String name;
	private int releaseYear;
	private int rating;
	private String type;
	private PImage image;
	private PApplet app;
	
	public Item(String name, int releaseYear, int rating, String type, PImage image, PApplet app) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.type=type;
		this.image = image;
		this.app = app;
	}

	public void draw(int x) {
		app.image(image, x,  75, 150, 200);
		app.text(type(),x, 300);
	}
	
	
	public String exportString(char c) {
		String info="";
		
		switch(c) {
		case 'r':
			info+= name+" | "+releaseYear+ " | "+rating+"% | "+ type;
			break;
		case 'a':
			info+= name+" | "+releaseYear+ " | "+rating+"% | "+ type;
			break;
		case 'n':
			info+= name.toUpperCase()+" | "+releaseYear+ " | "+rating+"% | "+ type;
			break;
		case 't':
			info+= name+" | "+releaseYear+ " | "+rating+"%  | "+ type.toUpperCase();
			break;
		}
		
		return info;
	}
	
	
	
	//rating
	@Override
	public int compareTo(Item i1) {
		return rating-i1.rating;
	}

	private String type() {
		String info="";
		info+= name+" \n"+releaseYear+ " , "+rating+"% , "+ type;
		return info;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PImage getImage() {
		return image;
	}

	public void setImage(PImage image) {
		this.image = image;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}


	
	
	
	
}
