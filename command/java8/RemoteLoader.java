public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Main House");
		Stereo stereo = new Stereo("Living Room");

		remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
		remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
		remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);

		Command stereoOnWithCD = () -> {
			stereo.on();
			stereo.setCd();
			stereo.setVolume(11);
		};

		remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
		remoteControl.setCommand(4, garageDoor::up, garageDoor::down);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);
		remoteControl.onButtonWasPressed(3);
		remoteControl.offButtonWasPressed(3);
		remoteControl.onButtonWasPressed(4);
		remoteControl.offButtonWasPressed(4);
	}

}
