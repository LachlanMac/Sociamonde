package com.lmac.sociamond.world.plants;

import java.util.ArrayList;
import com.lmac.sociamond.world.Plant;

public class PlantManager {

	ArrayList<Plant> plants;

	public PlantManager() {
		plants = new ArrayList<Plant>();
	}

	public void addPlant(Plant plant) {
		plants.add(plant);
	}

}
