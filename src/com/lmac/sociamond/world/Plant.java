package com.lmac.sociamond.world;

public class Plant {

	private String name;
	private int minTemp, maxTemp, minHumidity, maxHumidity, minHeight, maxHeight;
	private int unitsPerMeter;

	public Plant(String name, int minTemp, int maxTemp, int minHumidity, int maxHumidity, int minHeight, int maxHeight,
			int unitsPerMeter) {
		this.name = name;
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		this.minHumidity = minHumidity;
		this.maxHumidity = maxHumidity;
		this.minHeight = minHeight;
		this.maxHeight = maxHeight;
		this.unitsPerMeter = unitsPerMeter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public int getMinHumidity() {
		return minHumidity;
	}

	public void setMinHumidity(int minHumidity) {
		this.minHumidity = minHumidity;
	}

	public int getMaxHumidity() {
		return maxHumidity;
	}

	public void setMaxHumidity(int maxHumidity) {
		this.maxHumidity = maxHumidity;
	}

	public int getMinHeight() {
		return minHeight;
	}

	public void setMinHeight(int minHeight) {
		this.minHeight = minHeight;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	public int getUnitsPerMeter() {
		return unitsPerMeter;
	}

	public void setUnitsPerMeter(int unitsPerMeter) {
		this.unitsPerMeter = unitsPerMeter;
	}

}
