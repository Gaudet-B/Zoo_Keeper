package com.zookeeper;

public class Mammal {
	private int energyLevel;
	
	// Constructor:
	public Mammal() {
		this.energyLevel = 10;
	}
	
	// Methods:
	public int displayEnergyLevel() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	
	// Getter & Setter:
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
