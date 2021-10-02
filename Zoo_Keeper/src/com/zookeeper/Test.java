package com.zookeeper;

public class Test {

	public static void main(String[] args) {
		
		Gorilla gorilla = new Gorilla("Harambe");
		
		gorilla.throwSomething("a rock");
		gorilla.throwSomething("a tire");
		gorilla.throwSomething("... A CAR ?!?");
		
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		gorilla.climb();
	}

}
