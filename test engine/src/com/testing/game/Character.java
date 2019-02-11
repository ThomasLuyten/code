package com.testing.game;

import com.testing.engine.gfx.Image;

/*
 * deze subklasse van object zal de klasse van het main character zijn.
 * 
 */
public class Character extends Object{

	private int x,y;
	private int[] location;
	private final String name;
	private Image image;
	
	
	public Character(int width, int height, int startX, int startY, String name, Image image) {
		this.setW(width);
		this.setH(height);
		this.setOpp();
		this.x = startX;
		this.y = startY;
		this.name = name;
		this.image = image;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int[] getLocation() {
		return location;
	}


	public void setLocation(int[] location) {
		this.location = location;
	}


	public String getName() {
		return name;
	}


	public Image getImage() {
		return image;
	}
}
