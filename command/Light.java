public class Light {

	String label = "unlabeled";

	public Light(String label) {
		this.label = label;
	}

	public void on() {
		System.out.println("The " + label + " light is now on.");
	}

	public void off() {
		System.out.println("The " + label + " light is now off.");
	}

}
