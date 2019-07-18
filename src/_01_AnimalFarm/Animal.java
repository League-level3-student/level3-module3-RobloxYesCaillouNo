package _01_AnimalFarm;

public abstract class Animal {

	public abstract void makeNoise();

	public void eatNDrink() {

	}

}

class Pig extends Animal {

	public void makeNoise() {
		System.out.println("Oink");
	}

}

class Cow extends Animal {

	public void makeNoise() {
		System.out.println("moo");
	}

}

class Sheep extends Animal {

	public void makeNoise() {
		System.out.println("baaaah");
	}

}

class Dog extends Animal {

	public void makeNoise() {
		System.out.println("bork");
	}

}
