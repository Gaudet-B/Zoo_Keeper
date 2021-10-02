package com.zookeeper;

public class Bat extends Mammal {
	
	// Constructor:
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	// Methods:
	public void fly() {
		System.out.println("VOOOOOOM");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("KR-RUNCH!");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("KA-BOOM!");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}

}
