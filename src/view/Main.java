package view;


import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	private Controller controller;
	private PImage[] images;
	private String[] input;
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(1300,400);
	
	}
	public void setup() {
		controller= new Controller(this);
		input= loadStrings("data/netflix.txt");
		images= new PImage[7];
		String name="";
		for (int i = 0; i < input.length; i++) {
			String[] info=input[i].split(",",2);
			name=info[0].replace(" ", "").toLowerCase();
			images[i]=loadImage(name+".jpg");
		}
		controller.addItems(input, images);
	}
	

	
	public void draw() {
		background(0);
		for (int i = 0; i < controller.getItemList().getItems().length; i++) {
			controller.getItemList().getItems()[i].draw(50+(i*175));
		}
	}
	
	public void keyPressed() {
		controller.sort(key);
	}

}
