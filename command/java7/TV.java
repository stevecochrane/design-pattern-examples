public class TV {

	String label = "unlabeled";

	public TV(String label) {
		this.label = label;
	}

	public void on() {
		System.out.println("The " + label + " TV is now on.");
	}

	public void off() {
		System.out.println("The " + label + " TV is now off.");
	}

	public void setInputChannel(int channel) {
		System.out.println("The " + label + " TV's input channel has been set to " + channel + ".");
	}

	public void setVolume(int volume) {
		System.out.println("The " + label + " TV's volume has been set to " + volume + ".");
	}

}
