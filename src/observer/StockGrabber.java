package observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	ArrayList<Observer> observers;
	private double ibmPrice;
	private double aplePrice;
	private double goglePrice;
	
	public StockGrabber() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		int index = observers.indexOf(observer);
		if(index>-1) {
			System.out.println("Observer "+(index+1)+" is unregister successfully");
			observers.remove(index);
		}
		else {
			System.out.println("Observer "+(index+1)+" is can't unregister");
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, aplePrice, goglePrice);
		}
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setAplePrice(double aplePrice) {
		this.aplePrice = aplePrice;
		notifyObserver();
	}

	public void setGoglePrice(double goglePrice) {
		this.goglePrice = goglePrice;
		notifyObserver();
	}
	
	

	
}
