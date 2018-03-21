public class Stereo {

	public Stereo() {}

	public void on() {
		System.out.println("The stereo is now on.");
	}

	public void off() {
		System.out.println("The stereo is now off.");
	}

	public void setCd() {
		System.out.println("The stereo has been set to CD mode.");
	}

	public void setDvd() {
		System.out.println("The stereo has been set to DVD mode.");
	}

	public void setRadio() {
		System.out.println("The stereo has been set to radio mode.");
	}

	public void setVolume(int volume) {
		System.out.println("The stereo's volume has been set to " + volume + ".");
	}

}
