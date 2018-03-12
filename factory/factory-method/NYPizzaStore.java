public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
//			return new NYStyleVeggiePizza();
			return null;
		} else if (item.equals("clam")) {
//			return new NYStyleClamPizza();
			return null;
		} else if (item.equals("pepperoni")) {
//			return new NYStylePepperoniPizza();
			return null;
		} else return null;
	}

}
