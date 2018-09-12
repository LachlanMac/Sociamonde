package com.lmac.sociamond.managers;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

import com.lmac.sociamond.locations.Location;

public class LocationManager implements GameComponent {

	ArrayList<Location> locations;

	public LocationManager() {
		loadData();
	}

	@Override
	public void update(GameContainer gc, StateBasedGame game, int deltaTime) {
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame game, Graphics gfx) {

	}

	public void loadData() {
		
	}

}
