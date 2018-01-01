package factory.example1;

public class Sticks extends IceCream {

	
	
	public Sticks() {
		super();
		// TODO Auto-generated constructor stub
		setCost("Low");
		setShape("solid");
		setName("Sticks");
	}

	@Override
	public String getCost() {
		// TODO Auto-generated method stub
		return super.getCost();
	}

	@Override
	public void setCost(String cost) {
		// TODO Auto-generated method stub
		super.setCost(cost);
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return super.getShape();
	}

	@Override
	public void setShape(String shape) {
		// TODO Auto-generated method stub
		super.setShape(shape);
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

	public void show() {
		System.out.println("name of ice cream is "+getName()+" cost is "+getCost()+" and shape is "+getShape());
	}
	
}
