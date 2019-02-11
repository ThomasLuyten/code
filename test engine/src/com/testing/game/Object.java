package com.testing.game;


public abstract class Object 
{
	// image moet hier ook nog niet staan, image is gebonden aan het type object, gaat dus in de subklassen voorkomen
	private int w, h; // alle objects zijn rechthoekig om het iets simpeler te maken.
	private World world;
	private boolean terminated = false;
	private int opp = w*h;

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public boolean isTerminated() {
		return terminated;
	}

	public void setTerminated(boolean terminated) {
		this.terminated = terminated;
	}

	public int getOpp() {
		return opp;
	}

	public void setOpp() {
		this.opp = this.getH()*this.getW();
	}

	public World getWorld() {
		return world;
	}
}
