package com.lmac.sociamond.states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import com.lmac.sociamond.camera.Camera;
import com.lmac.sociamond.logs.Log;
import com.lmac.sociamond.world.World;

public class MainState extends BasicGameState {

	private int cameraX = 0, cameraY = 0;
	World world;
	Camera camera;

	@Override
	public void init(GameContainer gc, StateBasedGame game) throws SlickException {
		Log.print("Initializing Main State");
		this.camera = new Camera(0, 0, 1);
		world = new World(camera);
	}

	@Override
	public void enter(GameContainer gc, StateBasedGame game) {
		Log.print("Entering Main State");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame game, Graphics gfx) throws SlickException {
		camera.render(gc, game, gfx);
		world.render(gc, game, gfx);

	}

	@Override
	public void update(GameContainer gc, StateBasedGame game, int deltaTime) throws SlickException {
		camera.update(gc, game, deltaTime);
		world.update(gc, game, deltaTime);
	}

	@Override
	public int getID() {
		return 0;
	}

}
