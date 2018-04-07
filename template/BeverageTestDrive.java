public class BeverageTestDrive {

	public static void main(String[] args) {
		Tea tea = new Tea();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();

		System.out.println("\nMaking tea...");
		tea.prepareRecipe();

		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}

}
