package com.testing.game;

/*
 * een impassable blok op de map waar het character op kan gaan staan, maar niet door of in kan.
 */
public class Block extends Object {
	
	private final int x;
	private final int y;
	
	public Block(int x, int y, int w, int h)
	{
		this.x = x;
		this.y = y;
		this.setH(h);
		this.setW(w);
		this.setOpp();
	}
}
