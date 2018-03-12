public class SingletonDCL {

	private volatile static SingletonDCL uniqueInstance;

	//	other useful instance variables here

	private SingletonDCL() {}

	public static SingletonDCL getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonDCL.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonDCL();
				}
			}
		}
		return uniqueInstance;
	}

	//	other useful methods here

}
