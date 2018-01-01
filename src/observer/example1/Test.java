package observer.example1;

import java.util.Random;

public class Test {
	
	public static final int GOOGLE=0;
	public static final int IBM=1;
	public static final int APPLE=2;
	
	public static void main(String[] args) {
		//stockRunOnThread();
		simpleStock();
	}
	
	static void stockRunOnThread() {
		StockGrabber grabber= new StockGrabber();
		StockObserver observer1 = new StockObserver(grabber);
		StockObserver observer2 = new StockObserver(grabber);

		Thread t = new Thread(getRunnable(GOOGLE, grabber));
		Thread t2 = new Thread(getRunnable(IBM, grabber));
		Thread t3 = new Thread(getRunnable(APPLE, grabber));
		t.run();
		t2.run();
		t3.run();
	}
	
	static Runnable getRunnable(final int type,final StockGrabber grabber) {
		return new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10	; i++) { 
					switch(type) {
					case GOOGLE:
						grabber.setGoglePrice(100*(new Random().nextDouble()));
						break;
					case IBM:
						grabber.setIbmPrice(100*(new Random().nextDouble()));
						break;
					case APPLE:
						grabber.setAplePrice(100*(new Random().nextDouble()));
						break;
					}
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
	}
	
	static void simpleStock() {
		StockGrabber grabber= new StockGrabber();
		StockObserver observer1 = new StockObserver(grabber);
		StockObserver observer2 = new StockObserver(grabber);
		
		grabber.setAplePrice(200);
		grabber.setGoglePrice(2001);
		grabber.setIbmPrice(32134);
	}
	
}
