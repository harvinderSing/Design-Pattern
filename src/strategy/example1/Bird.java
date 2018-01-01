package strategy.example1;

import strategy.example1.fly.CanFly;
import strategy.example1.fly.Fly;

public class Bird extends Animal {

	public Bird(String name) {
		setName(name);
		setLeg(2);
		isFly = new CanFly();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getLeg() {
		// TODO Auto-generated method stub
		return super.getLeg();
	}
	
	@Override
	public Fly getIsFly() {
		// TODO Auto-generated method stub
		return super.getIsFly();
	}

	//In future,if you want to fly dog 
	@Override
	public void setIsFly(Fly isFly) {
		// TODO Auto-generated method stub
		super.setIsFly(isFly);
	}
	
	
	
}
