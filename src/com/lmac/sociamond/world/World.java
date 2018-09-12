package com.lmac.sociamond.world;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.lmac.sociamond.camera.Camera;
import com.lmac.sociamond.managers.GameComponent;

public class World implements GameComponent {

	private Image map;

	private Tile[][] tileMap;
	private int mapWidth, mapHeight;
	Camera camera;

	public World(Camera camera) {
		this.camera = camera;
		loadWorld("res/map/datamap.txt");
		loadMapImage("res/map/World_Map.png");
	}

	public void loadMapImage(String path) {

		try {
			map = new Image(path);
		} catch (SlickException e) {

			e.printStackTrace();
		}

	}

	public void loadWorld(String path) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			String data[] = br.readLine().split("<");

			String[] widthData = data[0].split("=");
			String[] heightData = data[1].split("=");

			mapWidth = Integer.parseInt(widthData[1]);
			mapHeight = Integer.parseInt(heightData[1]);

			tileMap = new Tile[mapWidth][mapHeight];

			int counter = 2;
			
			for (int y = 0; y < mapHeight; y++) {
				for (int x = 0; x < mapWidth; x++) {
					
					tileMap[x][y] = new Tile(data[counter], x, y);
					counter++;
				}
			}

			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void processMap() {

	}

	@Override
	public void update(GameContainer gc, StateBasedGame game, int deltaTime) {

		int xCoord = 0, yCoord = 0;

		if (gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			xCoord = camera.getXWorldCoordinates(gc.getInput().getMouseX());
			yCoord = camera.getYWorldCoordinates(gc.getInput().getMouseY());
			if (xCoord < mapWidth && xCoord >= 0 && yCoord < mapHeight && yCoord >= 0)
				System.out.println(tileMap[xCoord][yCoord].toString());
		}

	}

	@Override
	public void render(GameContainer gc, StateBasedGame game, Graphics gfx) {
		gfx.drawImage(map, 0, 0);
	}

}
