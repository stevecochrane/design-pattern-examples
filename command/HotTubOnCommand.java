public class HotTubOnCommand implements Command {

	HotTub hotTub;

	public HotTubOnCommand(HotTub hotTub) {
		this.hotTub = hotTub;
	}

	public void execute() {
		hotTub.on();
	}

	public void undo() {
		hotTub.off();
	}

}
