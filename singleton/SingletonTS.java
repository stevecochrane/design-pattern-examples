public class SingletonTS {

	private static SingletonTS uniqueInstance;

	//	other useful instance variables here

	private SingletonTS() {}

	public static synchronized SingletonTS getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonTS();
		}
		return uniqueInstance;
	}

	//	other useful methods here

}
