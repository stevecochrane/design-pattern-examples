public class CeilingFanMediumCommand implements Command {

	CeilingFan ceilingFan;
	int previousSpeed;

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}

	public void undo() {
		if (previousSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (previousSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (previousSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (previousSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
