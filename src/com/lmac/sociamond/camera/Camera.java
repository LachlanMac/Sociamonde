package com.lmac.sociamond.camera;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

import com.lmac.sociamond.managers.GameComponent;

public class Camera implements GameComponent {

	private final int MAX_ZOOM = 10;
	private final int MIN_ZOOM = 1;
	private int scrollSpeed = 5;
	private int x, y;
	private int zoom;

	public Camera(int x, int y, int zoom) {
		this.x = x;
		this.y = y;
		this.zoom = zoom;
		this.zoom = 5;
	}

	@Override
	public void update(GameContainer gc, StateBasedGame game, int deltaTime) {
		if (gc.getInput().isKeyDown(Input.KEY_D)) {
			x-= scrollSpeed;
		}
		if (gc.getInput().isKeyDown(Input.KEY_A)) {
			x+= scrollSpeed;
		}
		if (gc.getInput().isKeyDown(Input.KEY_W)) {
			y+= scrollSpeed;
		}
		if (gc.getInput().isKeyDown(Input.KEY_S)) {
			y-= scrollSpeed;
		}
		if (gc.getInput().isKeyPressed(Input.KEY_P)) {
			zoom = Math.min(zoom + 1, MAX_ZOOM);
		}
		if (gc.getInput().isKeyPressed(Input.KEY_O)) {
			
			zoom = Math.max(zoom - 1, MIN_ZOOM);
		}
	}

	@Override
	public void render(GameContainer gc, StateBasedGame game, Graphics gfx) {
		gfx.scale(zoom, zoom); 
		gfx.translate(x, y);

	}

	public int getXWorldCoordinates(int screenX) {
		
		return (screenX / zoom) - x;
	}

	public int getYWorldCoordinates(int screenY) {
		return (screenY / zoom) - y;
	}

}
