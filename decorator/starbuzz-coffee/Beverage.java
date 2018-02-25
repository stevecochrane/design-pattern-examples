public abstract class Beverage {

	public enum Size { TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	String description = "Unknown beverage";

	public String getDescription() {
		if (size == Size.TALL) {
			description = "Tall " + description;
		} else if (size == Size.GRANDE) {
			description = "Grande " + description;
		} else if (size == Size.VENTI) {
			description = "Venti " + description;
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
