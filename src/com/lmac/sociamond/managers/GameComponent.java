package com.lmac.sociamond.managers;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

public interface GameComponent {

	public abstract void update(GameContainer gc, StateBasedGame game, int deltaTime);

	public abstract void render(GameContainer gc, StateBasedGame game, Graphics gfx);

}
