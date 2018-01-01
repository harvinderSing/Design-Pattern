package observer;

public class StockObserver implements Observer {
	private double ibmPrice;
	private double aplePrice;
	private double goglePrice;
	
	private static int observerIDTracker =0;
	
	private int observerID;
	
	private Subject stockGrabberSubject;
	
	public  StockObserver(Subject stockGrabberSubject) {
		this.stockGrabberSubject=stockGrabberSubject;
		this.observerID=++observerIDTracker;
		System.out.println("new observer "+observerID);
		stockGrabberSubject.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double aplePrice, double goglePrice) {
		this.ibmPrice=ibmPrice;
		this.aplePrice=aplePrice;
		this.goglePrice= goglePrice;
		
		printPrices();
	}

	private void printPrices() {
		System.out.println("Observer id "+observerID
				+"\n IBM price    - "+this.ibmPrice
				+"\n Apple price  - "+this.aplePrice
				+"\n Google price - "+this.goglePrice
				);
	}

}
