package com.testing.engine;

import java.awt.image.DataBufferInt;

import com.testing.engine.gfx.Image;

public class Renderer 
{
	private int pW, pH;
	private int[] p;
	
	public Renderer(GameContainer gc) 
	{
		pW = gc.getWidth();
		pH = gc.getHeigth();
		p = ((DataBufferInt)gc.getWindow().getImage().getRaster().getDataBuffer()).getData();
	}
	
	public void clear()
	{
		for (int i = 0; i < p.length; i++)
		{
			p[i] = 0xff000000;
		}
	}
	
	public void setPixel(int x, int y, int value)
	{
		if((x < 0 || x >= pW || y < 0 || y >= pH) || value == 0xffff00ff)
		{
			return;
		}
		
		p[x + y * pW] = value;
	}
	
	public void drawImage(Image image, int offX, int offY)
	{
		int newX = 0;
		int newY = 0;
		int newWidth = image.getW();
		int newHeight = image.getH();
		
		//don't render
		if(offX < -newWidth) return;
		if(offY < -newHeight) return;
		if(offX >= pW) return;
		if(offY >= pH) return;
		//don't try to render parts out of bounds
		if(offX < 0) {newX -= offX;}
		if(offY < 0){newY -= offY;}
		if(newWidth + offX >= pW) {newWidth -= newWidth + offX - pW; }
		if(newHeight + offY >= pH){newHeight -= newHeight + offY - pH;}
		
		for(int y = newY; y < newHeight; y++)
		{
			for(int x = newX; x < newWidth; x++)
			{
				setPixel(x + offX, y + offY, image.getP()[x + y * image.getW()]);
			}
		}
	}
}
