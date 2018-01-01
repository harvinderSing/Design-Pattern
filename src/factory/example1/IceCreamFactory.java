package factory.example1;

public class IceCreamFactory {
	
	public static final int SOFT=0;
	public static final int GELATO=1;
	public static final int STICKS=2;
	
	
	public IceCream makeMyIceCream(int type) {
		switch(type) {
		case SOFT:
			return new Softy();
		case GELATO:
		return new Gelato();
		case STICKS:
			return new Sticks();
		}
		return null;
	}
}
