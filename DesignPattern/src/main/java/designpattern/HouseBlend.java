package designpattern;
public class HouseBlend extends Beverage {
	public HouseBlend() {
		super(�House blend�);
	}

	@Override
	public double cost() {
		return 250;
	}
}

public class DarkRoast extends Beverage {
	public DarkRoast() {
		super(�Dark roast�);
	}

	@Override
	public double cost() {
		return 300;
	}
}