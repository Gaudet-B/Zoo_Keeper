package com.zookeeper;

public class Gorilla extends Mammal {
	private String name;
	
	// Constructor:
	public Gorilla(String name) {
		this.name = name;
	}
	
	// Methods:
	public void throwSomething(String item) {
		System.out.println(this.name + " threw " + item + "!");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println(this.name + " ate some bananas and is very happy!");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println(this.name + " climbed a tree!");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
	
	// Getter & Setter:
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
