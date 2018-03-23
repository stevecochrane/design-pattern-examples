public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	int speed;
	String label = "unlabeled";

	public CeilingFan(String label) {
		this.label = label;
		speed = OFF;
	}

	public void high() {
		System.out.println("The " + label + " ceiling fan is now set to high.");
	}

	public void medium() {
		System.out.println("The " + label + " ceiling fan is now set to medium.");
	}

	public void low() {
		System.out.println("The " + label + " ceiling fan is now set to low.");
	}

	public void off() {
		System.out.println("The " + label + " ceiling fan is off.");
	}

	public int getSpeed() {
		return speed;
	}

}
