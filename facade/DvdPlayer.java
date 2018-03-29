public class DvdPlayer {

	Projector projector;

	public DvdPlayer(Projector projector) {
		this.projector = projector;
	}

	public void on() {
		System.out.println("The DvdPlayer is now on.");
	}

	public void off() {
		System.out.println("The DvdPlayer is now off.");
	}

	public void eject() {
		System.out.println("The DvdPlayer has ejected its disc.");
	}

	public void pause() {}

	public void play(String movieName) {
		System.out.println("The DvdPlayer is now playing: " + movieName);
	}

	public void setSurroundAudio() {}

	public void setTwoChannelAudio() {}

	public void stop() {
		System.out.println("The DvdPlayer has stopped.");
	}

	// public String toString() {}

}
