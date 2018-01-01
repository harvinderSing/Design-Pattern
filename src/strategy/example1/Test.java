package strategy.example1;

import strategy.example1.fly.CanFly;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("Tommy");
		Bird bird = new Bird("Tweety");
		
		//Dog
		System.out.println("My dog name is "+dog.getName()+" and it have "+dog.getLeg()+" legs.");
		if(dog.getIsFly().isFly()) {
			System.out.println("My dog can fly... may be he drink RedBull.");
		}
		else {
			System.out.println("Oops... My dog can't fly");
		}
		
		//Bird
		System.out.println("My bird name is "+bird.getName()+" and it have "+bird.getLeg()+" legs.");
		if(bird.getIsFly().isFly()) {
			System.out.println("My bird can fly");
		}
		else {
			System.out.println("Oops... My bird can't fly");
		}
		
		//Make dog fly
		dog.setIsFly(new CanFly());
		if(dog.getIsFly().isFly()) {
			System.out.println("My dog can fly... may be he drink RedBull.");
		}
		else {
			System.out.println("Oops... My dog can't fly");
		}
		
	}
}
