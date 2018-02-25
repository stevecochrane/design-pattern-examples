public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			cost += 0.05;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += 0.10;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += 0.15;
		}
		return cost;
	}

}
