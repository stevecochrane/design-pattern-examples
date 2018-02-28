public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
//			return new ChicagoStyleVeggiePizza();
			return null;
		} else if (item.equals("clam")) {
//			return new ChicagoStyleClamPizza();
			return null;
		} else if (item.equals("pepperoni")) {
//			return new ChicagoStylePepperoniPizza();
			return null;
		} else return null;
	}

}
