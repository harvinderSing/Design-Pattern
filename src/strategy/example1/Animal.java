package strategy.example1;

import strategy.example1.fly.Fly;

public class Animal {
	String name;
	int leg;
	protected Fly isFly;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		if(leg>0) {
			this.leg = leg;
		}
		else {
			System.out.println("Animal without legs are not allowed right now");
		}
	}
	public Fly getIsFly() {
		return isFly;
	}
	public void setIsFly(Fly isFly) {
		this.isFly = isFly;
	}
	
	
	
	
}
