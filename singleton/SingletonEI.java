public class SingletonEI {

	private static SingletonEI uniqueInstance = new SingletonEI();

	//	other useful instance variables here

	private SingletonEI() {}

	public static SingletonEI getInstance() {
		return uniqueInstance;
	}

	//	other useful methods here

}
