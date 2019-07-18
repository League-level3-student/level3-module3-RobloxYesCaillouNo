package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		
		farm.add(new Pig());
		farm.add(new Cow());
		farm.add(new Dog());
		farm.add(new Pig());
		farm.add(new Sheep());
		farm.add(new Sheep());

		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).eatNDrink();
			farm.get(i).makeNoise();
			
		
		}
	}

}
