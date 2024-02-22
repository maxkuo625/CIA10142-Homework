package homework_5;

public class myrectangle_method {

	private double width;
	private double depth;

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDpeth(double depth) {
		this.depth = depth;
	}

	public double getArea() {
		return (width * depth);
	}

	public myrectangle_method() {

	}

	public myrectangle_method(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
