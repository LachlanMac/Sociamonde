package com.lmac.sociamond.locations;

import com.lmac.sociamond.utils.math.Vector2;

public class Location {

	private String name;
	private Vector2 location;

	public Location(String name, Vector2 location) {
		this.name = name;
		this.location = location;
	}

	public Vector2 getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

}
