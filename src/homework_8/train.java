package homework_8;

import java.util.Objects;

public class train implements Comparable<train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public train(int number, String type, String start, String dest, double price) {

		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {

		return number;
	}

	public void setNumber(int number) {

		this.number = number;
	}

	public String getType() {

		return type;
	}

	public void setType(String type) {

		this.type = type;
	}

	public String getStart() {

		return start;
	}

	public void setStart(String start) {

		this.start = start;
	}

	public String getDest() {

		return dest;
	}

	public void setDest(String dest) {

		this.dest = dest;
	}

	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		train train = (train) o;
		return number == train.number && Double.compare(price, train.price) == 0 && Objects.equals(type, train.type)
				&& Objects.equals(start, train.start) && Objects.equals(dest, train.dest);
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, type, start, dest, price);
	}

	public int compareTo(train tr) {
		if (this.number > tr.number) {

			return -1;

		} else if (this.number == tr.number) {

			return 0;

		} else {

			return 1;

		}
	}

	@Override
	public String toString() {
		return "number=" + number + ", type='" + type + '\'' + ", start='" + start + '\'' + ", dest='" + dest + '\''
				+ ", price=" + price;
	}
}
