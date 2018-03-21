public class HotTub {

	String label = "unlabeled";

	public HotTub(String label) {
		this.label = label;
	}

	public void on() {
		System.out.println("The " + label + " hot tub is now on.");
	}

	public void off() {
		System.out.println("The " + label + " hot tub is now off.");
	}

	public void circulate() {
		System.out.println("The " + label + " hot tub's jets are now circulating.");
	}

	public void jetsOn() {
		System.out.println("The " + label + " hot tub's jets are now on.");
	}

	public void jetsOff() {
		System.out.println("The " + label + " hot tub's jets are now off.");
	}

	public void setTemperature(int temperature) {
		System.out.println("The " + label + " hot tub's temperature has been set to " + temperature + ".");
	}

}
