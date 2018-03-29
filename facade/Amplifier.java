public class Amplifier {

	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;

	public Amplifier(Tuner tuner, DvdPlayer dvd, CdPlayer cd) {
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
	}

	public void on() {
		System.out.println("The Amplifier is now on.");
	}

	public void off() {
		System.out.println("The Amplifier is now off.");
	}

	public void setCd() {
		System.out.println("The Amplifier is now setting a CD.");
	}

	public void setDvd() {
		System.out.println("The Amplifier is now setting a DVD.");
	}

	public void setStereoSound() {
		System.out.println("The Amplifier is now set to stereo sound.");
	}

	public void setSurroundSound() {
		System.out.println("The Amplifier is now set to surround sound.");
	}

	public void setTuner() {}

	public void setVolume(int volume) {
		System.out.println("The Amplifier's volume is now set to " + volume + ".");
	}

	// public String toString() {}

}
