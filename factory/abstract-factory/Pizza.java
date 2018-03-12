public abstract class Pizza {

	String name;

	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;

	abstract void prepare();

	void bake() {
		System.out.println("Baking for 25 minutes at 350 degrees...");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices...");
	}

	void box() {
		System.out.println("Placing pizza in official PizzaStore box...");
	}

	void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		//	Code to print pizza goes here
	}

}
