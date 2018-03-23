public class HotTubOffCommand implements Command {

	HotTub hotTub;

	public HotTubOffCommand(HotTub hotTub) {
		this.hotTub = hotTub;
	}

	public void execute() {
		hotTub.off();
	}

	public void undo() {
		hotTub.on();
	}

}
