package lang.object.test;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Rectangle other = (Rectangle)obj;
		return width == other.width && height == other.height;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
			"width=" + width +
			", height=" + height +
			'}';
	}
}
