package com.lmac.sociamond.world;

public class Tile {

	private int height, humidity, temperature, biomeID, x, y;
	boolean plantsCanGrow = true;

	public Tile(int height, int humidity, int temperature, int biomeID) {
		this.height = height;
		this.humidity = humidity;
		this.temperature = temperature;
		this.biomeID = biomeID;
	}

	public Tile(String hexData, int x, int y) {
		this.x = x;
		this.y = y;
		String heightHex = hexData.substring(0, 2);
		String humidityHex = hexData.substring(2, 4);
		String temperatureHex = hexData.substring(4, 6);
		String biomeHex = hexData.substring(6, 8);
		height = Integer.decode("0x" + heightHex);
		humidity = Integer.decode("0x" + humidityHex);
		temperature = Integer.decode("0x" + temperatureHex);
		biomeID = Integer.decode("0x" + biomeHex);

	}
	
	public String toString() {
		return "Tile : [" + x + ", " + y + "] HEIGHT:" + height + " HUMIDITY:" + humidity + " TEMPERATURE:"
				+ temperature;

	}

}
