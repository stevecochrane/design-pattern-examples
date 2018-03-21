public class CeilingFan {

	String label = "unlabeled";

	public CeilingFan(String label) {
		this.label = label;
	}

	public void on() {
		System.out.println("The " + label + " ceiling fan is now on.");
	}

	public void off() {
		System.out.println("The " + label + " ceiling fan is now off.");
	}

}
