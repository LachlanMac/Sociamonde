package com.lmac.sociamond.main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.lmac.sociamond.states.MainState;
public class Engine extends StateBasedGame{

	public Engine(String name) {
		super(name);

	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		this.addState(new MainState());
	}

}
