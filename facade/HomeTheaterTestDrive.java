public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Tuner tuner = new Tuner();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();

		DvdPlayer dvd = new DvdPlayer(projector);
		Amplifier amp = new Amplifier(tuner, dvd, cd);

		HomeTheaterFacade homeTheater =
			new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}

}
