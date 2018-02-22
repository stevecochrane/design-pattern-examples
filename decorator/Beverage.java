public abstract class Beverage {

	public enum Size { TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	String description = "Unknown beverage";

	public String getDescription() {
		switch (size) {
			case TALL:
				description = "Tall " + description;
				break;
			case GRANDE:
				description = "Grande " + description;
				break;
			case VENTI:
				description = "Venti " + description;
				break;
		}
		return description;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Size getSize() {
		return this.size;
	}

	public abstract double cost();

}
