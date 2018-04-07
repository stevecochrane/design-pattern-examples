public class Tea {

	void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	public void boilWater() {
		System.out.println("Boiling water...");
	}

	public void steepTeaBag() {
		System.out.println("Steeping the tea...");
	}

	public void addLemon() {
		System.out.println("Adding lemon...");
	}

	public void pourInCup() {
		System.out.println("Pouring into cup...");
	}

}
