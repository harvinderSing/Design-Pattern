package factory.example1;

public class Test {

	public static void main(String[] args) {
		//Mostly IceCreamFactory is singleton but we are not using it right now
		Softy softy = (Softy) new IceCreamFactory().makeMyIceCream(IceCreamFactory.SOFT);
		Gelato gelato = (Gelato) new IceCreamFactory().makeMyIceCream(IceCreamFactory.GELATO);
		Sticks sticks = (Sticks) new IceCreamFactory().makeMyIceCream(IceCreamFactory.STICKS);
		
		softy.show();
		gelato.show();
		sticks.show();
	}
}
