package com.lmac.sociamond.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Launcher {

public static void main(String[] args){
		
		AppGameContainer game;
		try {
			game = new AppGameContainer(new Engine("ENGINE prealpha v0.001.10"));
			game.setDisplayMode(1280, 800, false);
			game.setTargetFrameRate(60);
			game.setMaximumLogicUpdateInterval(60);
			game.setVSync(true);
			game.setUpdateOnlyWhenVisible(false);
			game.setAlwaysRender(true);
			// start game
			game.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
