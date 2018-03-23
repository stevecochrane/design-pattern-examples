public class GarageDoor {

	String label = "unlabeled";

	public GarageDoor(String label) {
		this.label = label;
	}

	public void up() {
		System.out.println("The " + label + " garage door is now open.");
	}

	public void down() {
		System.out.println("The " + label + " garage door is now closed.");
	}

	public void stop() {
		System.out.println("The " + label + " garage door has stopped.");
	}

	public void lightOn() {
		System.out.println("The " + label + " garage door's light has turned on.");
	}

	public void lightOff() {
		System.out.println("The " + label + " garage door's light has turned off.");
	}

}
