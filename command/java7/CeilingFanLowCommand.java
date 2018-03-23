public class CeilingFanLowCommand implements Command {

	CeilingFan ceilingFan;
	int previousSpeed;

	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
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
