public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Amplifier amp;
		Tuner tuner;
		DvdPlayer dvd;
		CdPlayer cd;
		Projector projector;
		TheaterLights lights;
		Screen screen;
		PopcornPopper popper;

		HomeTheaterFacade homeTheater =
			new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}

}
