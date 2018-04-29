public class HasQuarterState implements State {

	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You can't insert another quarter.");
	}

	public void ejectQuarter() {
		System.out.println("Quarter returned.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("You turned...");
	}

	public void dispense() {
		System.out.println("No gumball dispensed.");
	}

}
