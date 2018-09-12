package com.lmac.sociamond.utils.math;

public class Vector2 {
	float x, y;

	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float X() {
		return x;
	}

	public float Y() {
		return y;
	}

	@Override
	public String toString() {
		return "Vector2 (" + x + ", " + y + ")";
	}

}
