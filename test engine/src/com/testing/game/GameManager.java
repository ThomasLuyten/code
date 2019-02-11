package com.testing.game;

import com.testing.engine.AbstractGame;
import com.testing.engine.GameContainer;
import com.testing.engine.Renderer;
import com.testing.engine.gfx.Image;

public class GameManager extends AbstractGame
{
	
	private Image image;
	private Image background;
	
	public GameManager()
	{
		image = new Image("/test.png");
		background = new Image("/background.png");
	}

	@Override
	public void update(GameContainer gc, float dt) 
	{
		
	}

	@Override
	public void render(GameContainer gc, Renderer r) 
	{
		r.drawImage(background, 0,0);
		r.drawImage(image, gc.getInput().getMouseX() - 32, gc.getInput().getMouseY() - 32);
		if(gc.getInput().isKey(37))
		{
			r.drawImage(image, 10,150);
		}
		if(gc.getInput().isKey(39))
		{
			r.drawImage(image, 200, 150);
		}
	
		
	}
	
	public static void main(String args[])
	{
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}
}
